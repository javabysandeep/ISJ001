package com.itshaala;


import com.itshaala.beans.Employee;
import com.itshaala.config.SpringConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        System.out.println("Employee object from properties " + applicationContext.getBean("employee", Employee.class).hashCode());
        System.out.println("Employee object from properties " + applicationContext.getBean("employee", Employee.class).hashCode());
    }
}
