package com.eric.srb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.eric.srb"})
public class ServiceCoreApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(ServiceCoreApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
