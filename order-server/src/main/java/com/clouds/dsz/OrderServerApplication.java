package com.clouds.dsz;

import com.clouds.dsz.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients(basePackages = {"com.clouds.dsz.service"})
@SpringBootApplication
public class OrderServerApplication {

    /**
     * 初始化负载均衡RestTemplate
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(OrderServerApplication.class, args);
        OrderService bean = run.getBean(OrderService.class);
        String[] beanNamesForType = run.getBeanNamesForType(OrderService.class);
        System.out.println(bean);
    }


}
