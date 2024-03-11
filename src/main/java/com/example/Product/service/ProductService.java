package com.example.Product.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Product.dto.FakeStoreProductDto;

@Service
public class ProductService {

    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com";

    public FakeStoreProductDto[] getAllProducts() {
        FakeStoreProductDto response[] = restTemplate.getForObject(url + "/products/", FakeStoreProductDto[].class);
        return response;
    }

    public FakeStoreProductDto getProductbyId(Long id) {
        FakeStoreProductDto response = restTemplate.getForObject(url + "/products/" + id, FakeStoreProductDto.class);
        return response;
        // return "Product from Service with id: " + id;
    }
}
