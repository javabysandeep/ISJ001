package com.itshaala.springbootrest001.controller;

import com.itshaala.springbootrest001.model.Course;
import com.itshaala.springbootrest001.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/course")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/course/{courseId}")
    public Course findByCourseId(@PathVariable int courseId) {
        return courseService.findByCourseId(courseId);
    }

}
