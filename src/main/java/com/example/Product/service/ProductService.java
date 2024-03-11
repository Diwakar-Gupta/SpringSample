package com.example.Product.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public String getAllProducts() {
        return "All Products";
    }

    public String getProductbyId(Long id) {
        return "Product from Service with id: " + id;
    }
}
