package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("courseController")
public class CourseController {
    @Autowired
    CourseService courseService;

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }

    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
}
