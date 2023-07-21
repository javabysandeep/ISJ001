package com.itshaala;


import com.itshaala.config.SpringConfig;
import com.itshaala.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotations {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product);
    }
}
