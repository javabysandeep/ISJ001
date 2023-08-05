/*
package com.itshaala.controller;

import com.itshaala.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseControllerBkp {
    public static List<Course> courseList = new ArrayList<>();

    static {
        Course course1 = new Course();
        course1.setCourseId(1);
        course1.setCourseName("Java");
        course1.setCoursePrice(1000);
        course1.setCourseDescription("Full time");

        Course course2 = new Course();
        course2.setCourseId(2);
        course2.setCourseName("Python");
        course2.setCoursePrice(2000);
        course2.setCourseDescription("Full time");

        courseList.add(course1);
        courseList.add(course2);

    }

    @GetMapping
    public ModelAndView getAllCourses() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("courseListing");
        modelAndView.addObject("courses", getCourseList());
        return modelAndView;
    }

    @GetMapping("/{courseId}")
    public ModelAndView getCourseById(@PathVariable int courseId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("courseListing");
        modelAndView.addObject("courses", findCourseById(courseId));
        return modelAndView;
    }


    @PostMapping
    public ModelAndView addCourse(@RequestBody Course course) {
        courseList.add(course);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("courseListing");
        modelAndView.addObject("courses", getAllCourses());
        return modelAndView;
    }

    private static List<Course> getCourseList() {
        return courseList;
    }

    private static List<Course> findCourseById(int courseId) {
        return courseList.stream().filter(course -> course.getCourseId() == courseId).toList();
    }
}
*/
