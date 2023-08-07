package com.itshaala.springboot001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBoot001Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot001Application.class, args);
        Dao dao = context.getBean("dao", Dao.class);
        for (Course course : dao.getAllCourse()) {
            System.out.println(course);
        }
    }

}
