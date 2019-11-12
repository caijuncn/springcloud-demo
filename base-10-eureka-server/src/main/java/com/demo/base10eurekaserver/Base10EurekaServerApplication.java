package com.demo.base10eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Base10EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Base10EurekaServerApplication.class, args);
    }

}
