package com.openfeign.dsz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@SpringBootApplication
public class OpenfeignClientApplication {

    @Bean
    @LoadBalanced //用户客户端Ribbon拦截url重构实现负载均衡
    public RestTemplate restTemplate(){
        OkHttp3ClientHttpRequestFactory factory = new OkHttp3ClientHttpRequestFactory();
        return new RestTemplate(factory);
    }

    public static void main(String[] args) {
        SpringApplication.run(OpenfeignClientApplication.class, args);
    }

}
