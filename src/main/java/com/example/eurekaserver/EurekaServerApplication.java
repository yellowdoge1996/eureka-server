package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
//Person p = (@MyAnnotation Person) new Object();
    Person p;
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
