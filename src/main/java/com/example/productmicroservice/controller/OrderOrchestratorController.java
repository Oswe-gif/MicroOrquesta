package com.example.productmicroservice.controller;

import com.example.productmicroservice.controller.dto.CustomerDTO;
import com.example.productmicroservice.logic.CustomerService;
import com.example.productmicroservice.logic.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class OrderOrchestratorController {
    private CustomerService customerService;
    private ProductService productService;

    @PostMapping(path = "api/order/{idCustomer}/{idProduct}")
    public String createOrder(@PathVariable String idCustomer,@PathVariable String idProduct)
    {
        return "A order was created. customer information:"+customerService.getCustomer(idCustomer).toString()
                +". Order information: "+productService.getProduct(idProduct).toString();
    }


}
