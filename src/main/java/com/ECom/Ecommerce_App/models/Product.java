package com.ECom.Ecommerce_App.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

// create lombok to generate getters and setters
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
//@Component
public class Product {
    @Id
    private int productId;
    private String productName;
    private double price;

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
