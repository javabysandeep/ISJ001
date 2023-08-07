package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Dao dao = applicationContext.getBean("dao", Dao.class);
        List<Course> allCourse = dao.getAllCourse();
        for (Course course : allCourse) {
            System.out.println(course);
        }
    }
}
