package com.example.msproduct.service;

import com.example.msproduct.dto.ProductRequest;
import com.example.msproduct.entities.Product;
import com.example.msproduct.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    public void createProduct(ProductRequest productRequest){
        //map Product request to Product object
        Product product = new Product();
        product.setZoneid(productRequest.zoneid());
        product.setZonename(productRequest.zonename());
        product.setDescription(productRequest.description());
        product.setName(productRequest.name());
        product.setPrice(productRequest.price());
        productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public List<Product> getProductByZoneid(Integer zoneid){
        return productRepository.findByZoneid(zoneid);
    }
}
