package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author czj
 * @description ZuulApplication
 * @since 2022/10/14 18:57
 */
@EnableZuulProxy    //生成网关代理   包含了 `@EnableZuulServer`，设置该类是网关的启动类
@EnableAutoConfiguration   //自动装载配置   可以帮助 Spring Boot 应用将所有符合条件的 `@Configuration` 配置加载到当前 Spring Boot 创建并使用的 IoC 容器中
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
