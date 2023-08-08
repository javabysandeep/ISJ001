package com.example.springboot003datajpa;

import com.example.springboot003datajpa.controller.CourseController;
import com.example.springboot003datajpa.model.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot003DataJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot003DataJpaApplication.class, args);
        CourseController courseController = context.getBean("courseController", CourseController.class);

        System.out.println("Delete Course ");
       // courseController.deleteCourseById(1);
        for (Course course : courseController.findByCourseName("Python")) {
            System.out.println(course);
        }
    }

}
