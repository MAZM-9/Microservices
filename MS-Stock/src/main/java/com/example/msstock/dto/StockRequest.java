package com.example.msstock.dto;


public record StockRequest(String id,String name, Integer zoneid,String description,int quantity) {
}
