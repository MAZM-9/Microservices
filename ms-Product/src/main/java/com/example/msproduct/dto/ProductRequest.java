package com.example.msproduct.dto;

public record ProductRequest(long id,String name,String description,Double price,Integer zoneid,String zonename) {
}
