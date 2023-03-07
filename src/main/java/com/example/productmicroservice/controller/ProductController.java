package com.example.productmicroservice.controller;

import com.example.productmicroservice.entity.Product;
import com.example.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @GetMapping("api/products")
    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }
    @PostMapping("api/product")
    public void createProduct(@RequestBody Product product)
    {
        productRepository.save(product);
    }

}
