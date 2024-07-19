package com.example.msstock.client;

import com.example.msstock.entities.StockProduct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name ="MS-PRODUCT")
public interface ProductCleint {

    @RequestMapping(method = RequestMethod.GET,value = "/api/product/zone/{zoneid}")
    List<StockProduct> getProductsByZone(@PathVariable  Integer zoneid);
}
