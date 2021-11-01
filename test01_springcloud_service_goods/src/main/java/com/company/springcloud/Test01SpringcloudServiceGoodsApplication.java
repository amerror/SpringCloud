package com.company.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Test01SpringcloudServiceGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Test01SpringcloudServiceGoodsApplication.class, args);
    }

}
