package com.ECom.Ecommerce_App.controllers;

import com.ECom.Ecommerce_App.models.Product;
import com.ECom.Ecommerce_App.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProducts() {
       return productService.getProducts();
    }

    @RequestMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId) {
        return productService.getProductById(productId);
    }
}
