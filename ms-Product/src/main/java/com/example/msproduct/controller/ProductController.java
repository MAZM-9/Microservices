package com.example.msproduct.controller;


import com.example.msproduct.dto.ProductRequest;
import com.example.msproduct.entities.Product;
import com.example.msproduct.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor

public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
        return "Product added succefully";

    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    // a Get method that require product zoneid to get the product or list of products
    @GetMapping("/zone/{zoneid}")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> getProductsByZoneid(@PathVariable Integer zoneid) {
        return productService.getProductByZoneid(zoneid);
    }
}
