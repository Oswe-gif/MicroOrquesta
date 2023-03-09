package com.example.productmicroservice.logic;
import com.example.productmicroservice.controller.dto.SellerDTO;
import com.example.productmicroservice.repository.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SellerService {
    private SellerRepository sellerRepository;
    public void createSeller(SellerDTO seller){sellerRepository.save(seller);}
    public List<SellerDTO> getAllSellers(){return sellerRepository.findAll();}
    public Optional<SellerDTO> getSeller(String id){return sellerRepository.findById(id);}
}
