package com.veaf.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * eureka client，需要在配置文件（.yml）中注明自己的服务注册中心的地址
 * 服务名为SERVICE-HI ,端口为7862 （默认单例，可在configurations取消单例，然后更改端口号实现启动多个实例）
 */
@SpringBootApplication
@EnableEurekaClient //表明自己是一个eureka client
@RestController
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam String name) {

        return "hi "+name+",i am from port:" +port;
    }
}
