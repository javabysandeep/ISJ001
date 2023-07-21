package com.itshaala;

import com.itshaala.config.SpringConfig;
import com.itshaala.contoller.ProductController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        ProductController productController = applicationContext.getBean("productController", ProductController.class);
        productController.addProduct();

    }
}
