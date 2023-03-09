package com.example.productmicroservice.controller;

import com.example.productmicroservice.controller.dto.CustomerDTO;
import com.example.productmicroservice.logic.CustomerService;
import com.example.productmicroservice.logic.ProductService;
import com.example.productmicroservice.logic.SellerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class OrderOrchestratorController {
    private CustomerService customerService;
    private ProductService productService;
    private SellerService sellerService;

    @PostMapping(path = "api/order/{idCustomer}/{idProduct}/{idSeller}")
    public String createOrder(@PathVariable String idCustomer,@PathVariable String idProduct,@PathVariable String idSeller)
    {
        return "A order was created. customer information:"+customerService.getCustomer(idCustomer).toString()
                +". Order information: "+productService.getProduct(idProduct).toString()
                +". Seller information: "+sellerService.getSeller(idSeller).toString();
    }


}
