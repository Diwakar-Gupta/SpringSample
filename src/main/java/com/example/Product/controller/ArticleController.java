package com.example.Product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {

    @GetMapping("/articles/")
    public String getAllArticles() {
        return "All Articles";
    }
}
