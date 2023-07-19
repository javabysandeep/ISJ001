package com.itshaala;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Employee employee1 = annotationConfigApplicationContext.getBean("employee", Employee.class);
        Employee employee2 = annotationConfigApplicationContext.getBean("employee", Employee.class);
        System.out.println("Employee with collection : " + employee1.hashCode());
        System.out.println("Employee with collection : " + employee2.hashCode());


    }
}
