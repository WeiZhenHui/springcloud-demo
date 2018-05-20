package com.veaf.serviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Service Ribbon，端口为8764
 * ribbon是一个负载均衡客户端，可以很好的控制htt和tcp的一些行为
 */
@SpringBootApplication
@EnableDiscoveryClient //通过@EnableDiscoveryClient向服务中心注册
public class ServiceRibbonApplication {

    public static void main(String[] args) {

        SpringApplication.run(ServiceRibbonApplication.class, args);
    }

    @Bean // 向程序的ioc注入一个bean: restTemplate;
    @LoadBalanced // 通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
