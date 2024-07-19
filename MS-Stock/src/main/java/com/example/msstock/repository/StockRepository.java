package com.example.msstock.repository;

import com.example.msstock.entities.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockRepository extends MongoRepository<Stock,String> {

}
