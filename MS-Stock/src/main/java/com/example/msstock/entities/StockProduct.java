package com.example.msstock.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class StockProduct {
    private String productId;
    private String name;
    private String description;
    private Double price;
}
