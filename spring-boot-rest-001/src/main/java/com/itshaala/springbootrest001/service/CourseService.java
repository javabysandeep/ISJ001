package com.itshaala.springbootrest001.service;

import com.itshaala.springbootrest001.dao.CourseDao;
import com.itshaala.springbootrest001.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseDao courseDao;

    public List<Course> getAllCourses() {
        return courseDao.findAll();
    }

    public Course findByCourseId(int courseId) {
        return (Course) courseDao.findAllById(Collections.singleton(Integer.valueOf(courseId)));
    }

}
