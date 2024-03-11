package com.example.Product.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.Product.dto.FakeStoreProductDto;
import com.example.Product.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ProductController {
    ProductService ps;

    ProductController(ProductService ps) {
        this.ps = ps;
    }

    @GetMapping("/products/")
    public String getAllProducts() {
        return ps.getAllProducts();
    }

    @GetMapping("/products/{id}/")
    public FakeStoreProductDto getProductbyId(@PathVariable Long id) {

        return ps.getProductbyId(id);
    }

}
