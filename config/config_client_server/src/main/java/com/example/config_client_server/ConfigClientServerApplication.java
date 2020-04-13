package com.example.config_client_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Component;

@EnableDiscoveryClient
@Component(value = "com.example.config_client_server.*")
@SpringBootApplication
public class ConfigClientServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientServerApplication.class, args);
    }

}
