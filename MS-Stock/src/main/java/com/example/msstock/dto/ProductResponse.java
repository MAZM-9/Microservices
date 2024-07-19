package com.example.msstock.dto;

import java.util.List;

public record ProductResponse(long id, String name, String description, Double price, Integer zoneid, String zonename,
                              List<ProductResponse> products) {
}
