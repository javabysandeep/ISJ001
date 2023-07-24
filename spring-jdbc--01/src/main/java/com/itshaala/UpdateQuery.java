package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 */
public class UpdateQuery {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String query = "update course set price=? where id=?";
        jdbcTemplate.update(query, 70000, 100);
        System.out.println("Updated the table");

    }
}
