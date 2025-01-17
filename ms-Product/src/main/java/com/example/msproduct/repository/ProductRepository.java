package com.example.msproduct.repository;

import com.example.msproduct.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByZoneid(Integer zoneid);
}
