package com.ECom.Ecommerce_App.services;

import com.ECom.Ecommerce_App.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Apple", 10.0),
            new Product(2, "Banana", 20.0),
            new Product(3, "Orange", 30.0)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int productId) {
//        return products.get(productId);
        return products.stream()
                .filter(product -> product.getProductId() == productId)
                .findFirst().orElse(new Product(0, "No product found", 0.0));
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
