package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author czj
 * @description EurekaServiceApplication
 * @since 2022/10/13 23:02
 */
@SpringBootApplication   //声明该类是 Spring Boot 服务的入口
@EnableEurekaServer      //声明该类是一个 Eureka Server 微服务，提供服务注册和服务发现功能，即注册中心
public class EurekaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class,args);
    }
}
