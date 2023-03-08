package com.example.productmicroservice.logic;
import com.example.productmicroservice.controller.entity.ProductDTO;
import com.example.productmicroservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@Getter
@AllArgsConstructor
public class ProductService {
    private ProductRepository productRepository;

    public List<ProductDTO> getAllProducts()
    {
        return productRepository.findAll();
    }
    public Optional<ProductDTO> getProduct(String id)
    {
        return productRepository.findById(id);
    }
    public void createProduct(ProductDTO product)
    {
        productRepository.save(product);
    }
}
