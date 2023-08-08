package com.example.springboot003datajpa.service;

import com.example.springboot003datajpa.dao.CourseDao;
import com.example.springboot003datajpa.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public void deleteCourseById(int courseId) {
        courseDao.deleteById(courseId);
    }

    public List<Course> getAllCourses() {

        return (List<Course>) courseDao.findAll();
    }

    public List<Course> findByCourseName(String courseName) {
        return courseDao.findByCourseNameContainingIgnoreCase(courseName);
    }

}
