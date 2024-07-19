package com.example.msstock.dto;


public record StockResponse(String id, String name, Integer zoneid, String description, int quantity,
                            java.util.List<com.example.msstock.entities.StockProduct> products) { }
