package com.itshaala;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.cfg.xml");
        Employee employeeSandesh = applicationContext.getBean("employee", Employee.class);
        System.out.println("XMl way bean " + employeeSandesh);

        Employee employeePriya = applicationContext.getBean("employee2", Employee.class);
        System.out.println("XMl way bean " + employeePriya);

        Product product = applicationContext.getBean("product", Product.class);
        System.out.println("Product from the xml : "+product);
    }
}
