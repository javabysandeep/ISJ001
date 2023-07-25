package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SelectWithRowMapper {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String query = "select * from course";
        RowMapper<Course> rowMapper = (ResultSet rs, int rowNum) -> {
            Course course = new Course();
            course.setId(rs.getInt("id"));
            course.setCourseName(rs.getString("course_name"));
            course.setPrice(rs.getInt("price"));
            return course;
        };
        List<Course> courseList = jdbcTemplate.query(query, rowMapper);
        for (Course course : courseList) {
            System.out.println(course);
        }
    }
}
