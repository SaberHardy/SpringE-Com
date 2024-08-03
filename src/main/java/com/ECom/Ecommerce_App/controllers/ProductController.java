package com.ECom.Ecommerce_App.controllers;

import com.ECom.Ecommerce_App.models.Product;
import com.ECom.Ecommerce_App.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts() {
       return productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId) {
        return productService.getProductById(productId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
        System.out.println("Product==>: " + product);
        productService.addProduct(product);
    }
}
