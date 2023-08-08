package com.example.springboot002springorm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class Dao {
    @Autowired
    HibernateTemplate hibernateTemplate;

    public List<Course> getAllCourse() {
        return hibernateTemplate.loadAll(Course.class);
    }
}