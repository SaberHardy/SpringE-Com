package com.ECom.Ecommerce_App.models;

import lombok.Data;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

// create lombok to generate getters and setters
@Data
@AllArgsConstructor
//@Component
public class Product {

    private int productId;
    private String productName;
    private double price;
}
