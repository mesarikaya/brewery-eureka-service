package com.mes.breweryeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BreweryeurekaserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BreweryeurekaserverApplication.class, args);
    }

}
