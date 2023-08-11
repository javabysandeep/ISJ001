package com.itshaala.springbootrest002.controller;

import com.itshaala.springbootrest002.model.Course;
import com.itshaala.springbootrest002.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course findByCourseId(@PathVariable Integer courseId) {
        return courseService.findByCourseId(courseId);
    }

    @DeleteMapping("/courses/{courseId}")
    public String deleteByCourseId(@PathVariable Integer courseId) {
        courseService.deleteByCourseId(courseId);
        return "Course deleted successfully";
    }

    @PostMapping(value = "/courses", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {
                    MediaType.APPLICATION_ATOM_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
            })
    public Course createCourse(Course course) {
        return courseService.createCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

}
