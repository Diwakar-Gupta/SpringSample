package com.example.Product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Product.service.ProductService;

@RestController
public class ArticleController {

    @Autowired
    ProductService ps;

    // ArticleController(ProductService ps) {
    // this.ps = ps;
    // }

    @GetMapping("/articles/")
    public String getAllArticles() {
        return ps.getAllProducts();
    }
}
