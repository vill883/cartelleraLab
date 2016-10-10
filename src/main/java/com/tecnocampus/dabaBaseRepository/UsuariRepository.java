package com.tecnocampus.dabaBaseRepository;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by vil883 on 10/10/2016.
 */
public class UsuariRepository {
    private JdbcOperations jdbcOperations;

    public UsuariRepository(JdbcOperations jdbcOperations, NoteLabRepository noteLabRepository) {
        this.jdbcOperations = jdbcOperations;
        this.noteLabRepository = noteLabRepository;
    }

    public Iterable<UserLab> findAll() {
        return jdbcOperations.query("Select * from user_lab", new UserLabMapper());
    }

    public UserLab findOne(String userName) {
        return jdbcOperations.queryForObject("Select * from user_lab where username = ?", new Object[]{userName}, new UserLabMapper());
    }

    public int save(UserLab userLab) {
        int userUpdate = jdbcOperations.update("insert into user_lab values(?, ?, ?, ?)", userLab.getUsername(), userLab.getName(), userLab.getSecondName(), userLab.getEmail());
        noteLabRepository.saveUserNotes(userLab);

        return userUpdate;
    }

    private final class UserLabMapper implements RowMapper<UserLab> {
        @Override
        public UserLab mapRow(ResultSet resultSet, int i) throws SQLException {
            UserLab userLab = new UserLabBuilder().setUsername(resultSet.getString("username")).setName(resultSet.getString("name"))
                    .setSecondname(resultSet.getString("second_name")).setEmail(resultSet.getString("email"))
                    .createUserLab();
            List<NoteLab> notes = noteLabRepository.findAllFromUser(userLab.getUsername());
            userLab.addNotes(notes);
            return userLab;
        }
    }
}
