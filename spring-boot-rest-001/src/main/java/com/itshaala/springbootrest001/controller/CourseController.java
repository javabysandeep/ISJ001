package com.itshaala.springbootrest001.controller;

import com.itshaala.springbootrest001.model.Course;
import com.itshaala.springbootrest001.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/course/")
public class CourseController {
    @Autowired
    CourseService courseService;

    // @RequestMapping(value = "/courses", method = RequestMethod.GET)
    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("${courseId}")
    public Course findByCourseId(@PathVariable int courseId) {
        return courseService.findByCourseId(courseId);
    }

}
