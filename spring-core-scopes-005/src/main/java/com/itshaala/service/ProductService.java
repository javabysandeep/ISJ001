package com.itshaala.service;

import com.itshaala.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductDao productDao;

    ProductDao productDao1 = new ProductDao();

    public void addProduct() {
        System.out.println("service");
        productDao.addProduct();

    }
}
