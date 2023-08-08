package com.example.springboot003datajpa.dao;

import com.example.springboot003datajpa.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseDao extends CrudRepository<Course, Integer> {
    List<Course> findByCourseName(String s);

    List<Course> findByCourseNameContainingIgnoreCase(String courseName);
}
