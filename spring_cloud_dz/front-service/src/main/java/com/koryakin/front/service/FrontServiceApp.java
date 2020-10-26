package com.koryakin.front.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FrontServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(FrontServiceApp.class, args);
    }
}
