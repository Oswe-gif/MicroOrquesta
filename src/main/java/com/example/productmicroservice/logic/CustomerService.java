package com.example.productmicroservice.logic;
import com.example.productmicroservice.controller.entity.CustomerDTO;
import com.example.productmicroservice.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public List<CustomerDTO> getAllCustomers()
    {
        return customerRepository.findAll();
    }

    public void createCustomer(CustomerDTO customer)
    {
        customerRepository.save(customer);
    }

}
