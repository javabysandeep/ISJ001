package com.itshaala.springbootrest002.service;

import com.itshaala.springbootrest002.dao.CourseDao;
import com.itshaala.springbootrest002.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public List<Course> getAllCourses() {
        return courseDao.findAll();
    }

    public Course findByCourseId(Integer courseId) {
        return courseDao.findById(courseId).get();
    }

    public void deleteByCourseId(Integer courseId) {
        Course course = courseDao.findById(courseId).get();
        courseDao.delete(course);
    }

    public Course createCourse(Course course) {
        return courseDao.save(course);
    }
}
