package com.codecool.service.products.provider;

import com.codecool.model.products.Product;

import java.util.List;

public interface ProductProvider {
    List<Product> getProducts();
}