package com.example.Product.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Product.dto.FakeStoreProductDto;

@Service
public class ProductService {

    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com/";

    public String getAllProducts() {
        return "All Products";
    }

    public String getProductbyId(Long id) {
        var response = restTemplate.getForObject(url + "/products/" + id, FakeStoreProductDto.class);

        return "Product from Service with id: " + id;
    }
}
