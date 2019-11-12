package com.example.service11one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Service20TwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Service20TwoApplication.class, args);
    }

}
