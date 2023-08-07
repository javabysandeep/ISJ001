package com.itshaala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class Dao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Course> getAllCourse() {
        String sql = "select * from it_shaala.course";
        RowMapper<Course> rowMapper = (ResultSet rs, int rowNum) -> {
            Course course = new Course(rs.getInt("id"), rs.getString("course_name"), rs.getInt("price"));
            return course;
        };
        return jdbcTemplate.query(sql, rowMapper);
    }
}
