package com.tecnocampus.dabaBaseRepository;

import com.tecnocampus.domain.Cinema;
import com.tecnocampus.domain.CinemaBuilder;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by vil883 on 06/10/2016.
 */
@Repository
public class CinemaRepository {

    private JdbcOperations jdbcOperations;

    public CinemaRepository (JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    public Iterable<Cinema> findAll() {
        return jdbcOperations.query("Select * from note_lab", new CinemaRepository.CinemaMapper());
    }

    public Cinema findOne (long id) {
        return jdbcOperations.queryForObject("Select * from cimena_lab where id = ?", new Object[]{id}, new CinemaRepository.CinemaMapper());
    }


    private final class CinemaMapper implements RowMapper<Cinema> {
        @Override
        public Cinema mapRow(ResultSet resultSet, int i) throws SQLException {
            return new CinemaBuilder().setNom(resultSet.getString("nom"))
                    .setDireccio(resultSet.getString("Direccio"))
                    .setTelefon(resultSet.getString("Telefon"))
                    .createCinema();
        }
    }


}
