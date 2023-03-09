package com.example.productmicroservice.controller.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class SellerDTO {
    @Id
    private String id;
    private String sellerName;
    private String sellerDescription;

    @Override
    public String toString(){
        return "Seller{" +
                "sellerName'" + sellerName + '\'' +
                '}';
    }
}
