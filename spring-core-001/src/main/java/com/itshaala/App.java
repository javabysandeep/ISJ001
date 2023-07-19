package com.itshaala;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        //Step 1 : Tell Sprint Container to read the pojo class & read configuration
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        //step 2: Get the bean or instance or object and store that with the reference
        Employee employee = applicationContext.getBean("employee", Employee.class);

        //Step 3: use the reference to access the object
        System.out.println("Employee object from Spring Container " + employee);


        //product
        Product product = applicationContext.getBean("product", Product.class);
        System.out.println("Product from spring container " + product);

    }
}
