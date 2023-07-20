package com.itshaala;


import com.itshaala.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Employee employee1 = applicationContext.getBean("employee", Employee.class);
        Employee employee2 = applicationContext.getBean("employee", Employee.class);
        System.out.println(employee1.hashCode() + "\t" + employee2.hashCode());
    }
}
