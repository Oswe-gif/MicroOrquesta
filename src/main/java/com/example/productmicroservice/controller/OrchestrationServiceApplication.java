package com.example.productmicroservice.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class OrchestrationServiceApplication {
    private ProductController productController;
    private UserController userController;

    @GetMapping("api/productOrder")
    public String processOrder()
    {
        //List<Product> products = productController.createProduct();
        //List<Customer> customers = userController.createCustomer();
        return "";
    }
}
