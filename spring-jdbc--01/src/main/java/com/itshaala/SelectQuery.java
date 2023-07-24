package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Hello world!
 */
public class SelectQuery {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String selectQuery = "SELECT * FROM it_shaala.course";

        //mapping the course row to the course object
        RowMapper<Course> rowMapper = (ResultSet rs, int rowNum) -> {
            Course course = null;
            while (rs.next()) {
                course = new Course();
                course.setId(rs.getInt(rowNum));
                course.setCourseName(rs.getString(rowNum));
                course.setPrice(rs.getInt(rowNum));
            }
            return course;
        };
        List<Course> courses = jdbcTemplate.query(selectQuery, rowMapper);
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
