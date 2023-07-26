package com.itshaala.dao;

import com.itshaala.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addCourse(Course course) {
        String sql = "insert into course values(?,?,?)";
        jdbcTemplate.update(sql, course.getCourseId(), course.getCourseName(), course.getCoursePrice());
        System.out.println("Course saved");
    }

    public List<Course> getAllCourses() {
        String selectQuery = "select * from course";
        RowMapper<Course> rowMapper = (resultSet, rowNumber) -> {
            Course course = new Course();
            course.setCourseId(resultSet.getInt("id"));
            course.setCourseName(resultSet.getString("course_name"));
            course.setCoursePrice(resultSet.getInt("price"));
            return course;
        };
        List<Course> courses = jdbcTemplate.query(selectQuery, rowMapper);
        return courses;
    }
}
