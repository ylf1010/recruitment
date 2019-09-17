package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderJuneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderJuneApplication.class, args);
    }

}
