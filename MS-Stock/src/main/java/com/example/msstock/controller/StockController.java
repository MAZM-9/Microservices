package com.example.msstock.controller;
import com.example.msstock.dto.StockRequest;
import com.example.msstock.dto.StockResponse;
import com.example.msstock.entities.Stock;
import com.example.msstock.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stock")
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StockResponse createStock(@RequestBody  StockRequest stockRequest) {
        return stockService.createStock(stockRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StockResponse> getAllStocks() {
        return stockService.getAllStocks();
    }
}
