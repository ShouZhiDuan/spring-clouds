package com.clouds.dsz;

import com.clouds.dsz.service.OrderService;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

/**
 * 订单接口启动入口
 */
//@EnableCircuitBreaker
@EnableFeignClients
//@EnableFeignClients(basePackages = {"com.clouds.dsz.feign_client","com.clouds.dsz.service"})
//@EnableFeignClients(basePackages = "com.clouds.dsz.service")
@SpringBootApplication
public class OrderWebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(OrderWebApplication.class, args);
        ConfigurableListableBeanFactory beanFactory = run.getBeanFactory();
        Map<String, OrderService> beansOfType = beanFactory.getBeansOfType(OrderService.class);
        System.out.println(beansOfType);
    }

}
