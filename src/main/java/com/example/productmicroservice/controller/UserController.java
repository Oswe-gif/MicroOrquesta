package com.example.productmicroservice.controller;

import com.example.productmicroservice.controller.entity.CustomerDTO;
import com.example.productmicroservice.controller.entity.ProductDTO;
import com.example.productmicroservice.logic.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class UserController {

    private CustomerService customerService;

    @PostMapping("api/customer")
    public void createCustomer(@RequestBody CustomerDTO customer)
    {
        customerService.createCustomer(customer);
    }
    @GetMapping("api/customers")
    public List<CustomerDTO> getAllCustomers()
    {
        return customerService.getAllCustomers();
    }
    @GetMapping(path = "api/customer/{id}")
    public Optional<CustomerDTO> getProduct(@PathVariable String id)
    {
        return customerService.getCustomer(id);
    }

}
