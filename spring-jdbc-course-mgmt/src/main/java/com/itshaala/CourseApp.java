package com.itshaala;

import com.itshaala.config.MysqlDatabaseConfig;
import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class CourseApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MysqlDatabaseConfig.class);
        CourseController courseController = applicationContext.getBean("courseController",CourseController.class);

        Course course = new Course();
        course.setCourseId(2001);
        course.setCourseName("Ultimate Spring JDBC");
        course.setCoursePrice(78000);

        courseController.addCourse(course);
        System.out.println("End of course app");
    }
}
