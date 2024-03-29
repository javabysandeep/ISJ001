package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SelectQuery {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringPropertiesConfiguration.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate1", JdbcTemplate.class);
        String selectQuery = "SELECT * FROM it_shaala.course";

        //mapping the course row to the course object
        RowMapper<Course> rowMapper = (ResultSet rs, int rowNum) -> {
            Course course = new Course();
            course.setId(rs.getInt("id"));
            course.setCourseName(rs.getString("course_name"));
            course.setPrice(rs.getInt("price"));
            return course;
        };
        List<Course> courses = jdbcTemplate.query(selectQuery, rowMapper);
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}
