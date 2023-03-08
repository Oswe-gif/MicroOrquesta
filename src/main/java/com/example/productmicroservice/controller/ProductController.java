package com.example.productmicroservice.controller;

import com.example.productmicroservice.controller.entity.ProductDTO;
import com.example.productmicroservice.logic.ProductService;
import com.example.productmicroservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class ProductController {

    private ProductService productService;
    @PostMapping("api/product")
    public void createProduct(@RequestBody ProductDTO product)
    {
        productService.createProduct(product);
    }
    @GetMapping("api/products")
    public List<ProductDTO> getAllProducts()
    {
        return productService.getAllProducts();
    }
    @GetMapping(path = "api/product/{id}")
    public Optional<ProductDTO> getProduct(@PathVariable String id)
    {
        return productService.getProduct(id);
    }


}
