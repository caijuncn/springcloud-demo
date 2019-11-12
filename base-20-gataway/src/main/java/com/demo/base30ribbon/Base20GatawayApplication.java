package com.demo.base30ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Base20GatawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(Base20GatawayApplication.class, args);
    }

}
