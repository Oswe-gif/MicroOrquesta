package com.example.productmicroservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OrderOrchestratorController {
    private ProductController productController;
    private UserController userController;

    public String createOrder()
    {

        return "";
    }
    @GetMapping("api/productOrder")
    public String processOrder()
    {
        //List<Product> products = productController.createProduct();
        //List<Customer> customers = userController.createCustomer();
        return "";
    }
}
