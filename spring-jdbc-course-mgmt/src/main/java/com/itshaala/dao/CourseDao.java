package com.itshaala.dao;

import com.itshaala.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addCourse(Course course) {
        String sql = "insert into course values(?,?,?)";
        jdbcTemplate.update(sql, course.getCourseId(), course.getCourseName(), course.getCoursePrice());
        System.out.println("Course saved");
    }
}
