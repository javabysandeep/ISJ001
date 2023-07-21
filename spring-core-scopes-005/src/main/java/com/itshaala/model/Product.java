package com.itshaala.model;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component("product")
public class Product {
    @Value("10")
    private int productId;
    @Value("Laptop")
    private String productName;
}
