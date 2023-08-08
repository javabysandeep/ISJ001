package com.example.springboot003datajpa.controller;

import com.example.springboot003datajpa.dao.CourseDao;
import com.example.springboot003datajpa.model.Course;
import com.example.springboot003datajpa.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CourseController {
    @Autowired
    CourseService courseService;

    public void deleteCourseById(int courseId) {
        courseService.deleteCourseById(courseId);
    }

    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
    public List<Course> findByCourseName(String courseName) {
        return courseService.findByCourseName(courseName);
    }
}
