package com.itshaala;

import com.itshaala.config.MysqlDatabaseConfig;
import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class CourseApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MysqlDatabaseConfig.class);
        CourseController courseController = applicationContext.getBean("courseController", CourseController.class);

        /*Course course = new Course();
        course.setCourseId(1008);
        course.setCourseName("Ultimate Class and Object");
        course.setCoursePrice(7800);

        courseController.addCourse(course);
        System.out.println("End of course app");*/

        List<Course> allCourses = courseController.getAllCourses();
        for (Course course : allCourses) {
            System.out.println(course);
        }
    }
}
