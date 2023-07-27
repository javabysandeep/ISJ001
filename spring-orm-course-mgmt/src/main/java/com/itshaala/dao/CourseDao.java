package com.itshaala.dao;

import com.itshaala.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseDao {
    @Autowired
    HibernateTemplate hibernateTemplate;

    public void addCourse(Course course) {
        hibernateTemplate.save(course);
        System.out.println("Course saved");
    }

    public List<Course> getAllCourses() {
        return hibernateTemplate.loadAll(Course.class);
    }
}
