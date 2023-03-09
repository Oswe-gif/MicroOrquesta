package com.example.productmicroservice.controller;

import com.example.productmicroservice.controller.dto.SellerDTO;
import com.example.productmicroservice.logic.SellerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class SellerController {

    private SellerService sellerService;

    @PostMapping(path = "api/seller")
    public void createSeller(@RequestBody SellerDTO seller) {sellerService.createSeller(seller);}

    @GetMapping(path = "api/sellers")
    public List<SellerDTO> getAllSellers() {return sellerService.getAllSellers();}
    @GetMapping(path = "api/seller/{id}")
    public Optional<SellerDTO> getSeller(@PathVariable String id) {return sellerService.getSeller(id);}
}
