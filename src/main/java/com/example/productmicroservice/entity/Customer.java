package com.example.productmicroservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "client")//the collection in mongoDB is called "client"
@Setter
@Getter
public class Customer {
    @Id
    private String id;
    private String name;
    private int age;
}
