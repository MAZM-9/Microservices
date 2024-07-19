package com.example.msstock.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "stock")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stock {
    @Id
    private String id;
    private String name;
    private Integer zoneid;
    private String description;
    private int quantity;
    private List<StockProduct> products;


}
