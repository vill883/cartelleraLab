package com.tecnocampus.dabaBaseRepository;

import com.tecnocampus.domain.Usuari;
import com.tecnocampus.domain.UsuariBuilder;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by vil883 on 10/10/2016.
 */

@Repository
public class UsuariRepository {
    private JdbcOperations jdbcOperations;
    private CinemaRepository cinemaRepository;

    public UsuariRepository(JdbcOperations jdbcOperations, CinemaRepository cinemaRepository) {
        this.jdbcOperations = jdbcOperations;
        this.cinemaRepository = cinemaRepository;
    }

    public Iterable<Usuari> findAll() {
        return jdbcOperations.query("Select * from user_lab", new UsuariMapper());
    }

    public UserLab findOne(String userName) {
        return jdbcOperations.queryForObject("Select * from user_lab where username = ?", new Object[]{userName}, new UserLabMapper());
    }

    public int save(UserLab userLab) {
        int userUpdate = jdbcOperations.update("insert into user_lab values(?, ?, ?, ?)", userLab.getUsername(), userLab.getName(), userLab.getSecondName(), userLab.getEmail());
        noteLabRepository.saveUserNotes(userLab);

        return userUpdate;
    }

    private final class UsuariMapper implements RowMapper<Usuari> {
        @Override
        public Usuari mapRow(ResultSet resultSet, int i) throws SQLException {
            Usuari usuari = new UsuariBuilder().setNom(resultSet.getString("username")).seNom(resultSet.getString("name"))
                    .setSecondname(resultSet.getString("second_name")).setEmail(resultSet.getString("email"))
                    .createUserLab();
            List<NoteLab> notes = noteLabRepository.findAllFromUser(userLab.getUsername());
            userLab.addNotes(notes);
            return userLab;
        }
    }
}
