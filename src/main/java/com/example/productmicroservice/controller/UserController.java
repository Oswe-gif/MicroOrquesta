package com.example.productmicroservice.controller;

import com.example.productmicroservice.controller.entity.CustomerDTO;
import com.example.productmicroservice.repository.CustomerRepository;
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
    public List<CustomerDTO> getAllCustomers()
    {
        return customerRepository.findAll();
    }
    @PostMapping("api/customer")
    public void createCustomer(@RequestBody CustomerDTO customer)
    {
        customerRepository.save(customer);
    }
}
