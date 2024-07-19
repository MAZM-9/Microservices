package com.example.msstock.service;

import com.example.msstock.client.ProductCleint;
import com.example.msstock.dto.ProductResponse;
import com.example.msstock.dto.StockRequest;
import com.example.msstock.dto.StockResponse;
import com.example.msstock.entities.Stock;
import com.example.msstock.entities.StockProduct;
import com.example.msstock.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor

public class StockService {
    private static final Logger log = LoggerFactory.getLogger(StockService.class);
    private final StockRepository stockRepository;
    private final ProductCleint productCleint;

    public StockResponse createStock(StockRequest stockRequest) {
        List<StockProduct> products = productCleint.getProductsByZone(stockRequest.zoneid());
        if (!products.isEmpty()) {
            Stock stock = Stock.builder()
                    .name(stockRequest.name())
                    .description(stockRequest.description())
                    .zoneid(stockRequest.zoneid())
                    .quantity(stockRequest.quantity())
                    .products(products)
                    .build();
            stockRepository.save(stock);
            log.info("Stock created: {}", stock);
            return new StockResponse(stock.getId(), stock.getName(),stock.getZoneid(), stock.getDescription(), stock.getQuantity(),stock.getProducts());
        }else {
            log.info("Stock already exists");
            return null;
        }
    }

    public List <StockResponse> getAllStocks() {
        return stockRepository.findAll()
                .stream()
                .map(stock -> new StockResponse(stock.getId(),stock.getName(),stock.getZoneid(),stock.getDescription(),stock.getQuantity(),stock.getProducts()))
                .collect(Collectors.toList());

    }
}
