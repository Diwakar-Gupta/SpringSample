package com.example.Product.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto {
    Long id;
    String title;
    double price;
    String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
