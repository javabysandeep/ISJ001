package com.itshaala.contoller;

import com.itshaala.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
    @Autowired
    ProductService productService ;

    public void addProduct() {
        System.out.println("Controller");
        productService.addProduct();
    }
}
