package com.example.Product.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ProductController {

    @GetMapping("/products/")
    public String getAllProducts() {
        return "All Products";
    }
}
