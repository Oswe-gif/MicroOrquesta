package com.example.productmicroservice.controller;

import com.example.productmicroservice.logic.CustomerService;
import com.example.productmicroservice.logic.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OrderOrchestratorController {
    private CustomerService customerService;
    private ProductService productService;

    @PostMapping(path = "api/order{id}")
    public String createOrder(@PathVariable String id)
    {
        //create an order
        return "";
    }

    @GetMapping("api/order")
    public String processOrder()
    {
        //search an order
        return "";
    }
}
