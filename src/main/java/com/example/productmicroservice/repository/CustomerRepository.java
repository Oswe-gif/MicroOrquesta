package com.example.productmicroservice.repository;

import com.example.productmicroservice.entity.Customer;
import com.example.productmicroservice.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer,String> {
}
