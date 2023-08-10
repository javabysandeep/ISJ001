package com.itshaala.springbootrest002.dao;

import com.itshaala.springbootrest002.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Integer> {
}
