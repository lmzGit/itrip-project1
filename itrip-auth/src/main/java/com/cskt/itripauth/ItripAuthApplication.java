package com.cskt.itripauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

//@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.cskt.*"})
public class ItripAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItripAuthApplication.class, args);
    }

}
