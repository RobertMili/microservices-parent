package com.example.inventorydemo;

import com.netflix.appinfo.ApplicationInfoManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InventoryDemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(InventoryDemoApplication.class, args);
    }



}