package com.example.productmicroservice.controller;

import com.example.productmicroservice.entity.Customer;
import com.example.productmicroservice.entity.Product;
import com.example.productmicroservice.repository.CustomerRepository;
import com.example.productmicroservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private CustomerRepository customerRepository;
    @GetMapping("api/customers")
    public List<Customer> getAllCustomers()
    {
        return customerRepository.findAll();
    }
    @PostMapping("api/customer")
    public void createCustomer(@RequestBody Customer customer)
    {
        customerRepository.save(customer);
    }
}
