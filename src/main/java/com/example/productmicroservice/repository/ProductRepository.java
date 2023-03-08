package com.example.productmicroservice.repository;

import com.example.productmicroservice.controller.entity.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductDTO,String> {

}
