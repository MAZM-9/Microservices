package com.example.msconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsConfigServiceApplication.class, args);
    }

}
