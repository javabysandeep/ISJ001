package com.example.springboot002springorm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot002SpringOrmApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot002SpringOrmApplication.class, args);
        Dao dao = context.getBean("dao", Dao.class);
        for (Course course : dao.getAllCourse()) {
            System.out.println(course);
        }
    }

}
