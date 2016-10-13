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
        return jdbcOperations.query("Select * from usuari_cartellera", new UsuariMapper());
    }

   /* public UserLab findOne(String userName) {
        return jdbcOperations.queryForObject("Select * from user_lab where username = ?", new Object[]{userName}, new UserLabMapper());
    }*/

    public int save(Usuari usuari) {
        int userUpdate = jdbcOperations.update("insert into usuari_cartellera values(?, ?, ?, ?, ?, ? )", usuari.getDNI(),usuari.getNom(),usuari.getCognom(), usuari.getTelefon(),
                usuari.getIdUsuari(), usuari.getPassword());

        return userUpdate;
    }

    private final class UsuariMapper implements RowMapper<Usuari> {
        @Override
        public Usuari mapRow(ResultSet resultSet, int i) throws SQLException {
            Usuari usuari = new UsuariBuilder().setDNI("DNI").setNom(resultSet.getString("nom")).setCognom(resultSet.getString("cognom"))
                    .setTelefon(resultSet.getString("telefon")).setIdUsuari(resultSet.getString("idUsuari")).setPassword(resultSet.getString("password"))
                    .createUsuari();

            return usuari;
        }
    }
}
