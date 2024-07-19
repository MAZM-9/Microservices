package com.example.msstock;

import org.springframework.boot.SpringApplication;

public class TestMsStockApplication {

    public static void main(String[] args) {
        SpringApplication.from(MsStockApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
