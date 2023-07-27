package com.itshaala.service;

import com.itshaala.dao.CourseDao;
import com.itshaala.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    @Transactional
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }


    @Transactional
    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }
}
