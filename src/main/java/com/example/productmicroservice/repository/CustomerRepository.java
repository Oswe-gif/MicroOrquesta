package com.example.productmicroservice.repository;

import com.example.productmicroservice.controller.entity.CustomerDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerDTO,String> {
}
