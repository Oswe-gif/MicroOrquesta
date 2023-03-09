package com.example.productmicroservice.repository;

import com.example.productmicroservice.controller.dto.SellerDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends MongoRepository<SellerDTO,String> {

}
