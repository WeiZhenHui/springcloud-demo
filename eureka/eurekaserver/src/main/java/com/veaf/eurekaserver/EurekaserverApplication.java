package com.veaf.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka(尤里卡)服务注册中心 启动入口, 端口为8761
 */
@SpringBootApplication
@EnableEurekaServer //表明自己是一个eureka server
public class EurekaserverApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaserverApplication.class, args);
    }
}
