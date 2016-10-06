package com.tecnocampus.dabaBaseRepository;

import com.tecnocampus.domain.Cinema;
import com.tecnocampus.domain.CinemaBuilder;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by vil883 on 06/10/2016.
 */
public class CinemaRepository {

    private JdbcOperations jdbcOperations;

    public CinemaRepository (JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

  /*  public Iterable<Cinema> findAll() {
        return jdbcOperations.query("Select * from note_lab", new CinemaRepository.CinemaMapper());
    }*/


   /* private final class CinemaMapper implements RowMapper<Cinema> {
        @Override
        public Cinema mapRow(ResultSet resultSet, int i) throws SQLException {
            return new CinemaBuilder().setTitle(resultSet.getString("title"))
                    .setContent(resultSet.getString("content")).setTime(resultSet.getTimestamp("date_creation").toLocalDateTime())
                    .setTimeEdit(resultSet.getTimestamp("date_edit").toLocalDateTime())
                    .createNoteLab();
        }
    }*/


}
