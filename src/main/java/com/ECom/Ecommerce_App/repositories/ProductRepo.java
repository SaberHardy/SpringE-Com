package com.ECom.Ecommerce_App.repositories;

import com.ECom.Ecommerce_App.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    Product findByProductName(String productName);
}
