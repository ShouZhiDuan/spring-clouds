package com.clouds.dsz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.client.RestTemplate;

/**
 * Ribbon测试
 */
@SpringBootTest
class RibbonTest {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * 基于RestTemplate负载均衡调用
     */
    @Test
    void loaderBalancByRibbon() {
        while (true){
            String forObject = restTemplate.getForObject("http://order-api/ribbon/testApi", String.class);
            System.out.println(forObject);
        }
    }

    /**
     * 基于LoadBalancerClient负载均衡
     */
    @Test
    void loadBalancerClient() {
        while (true){
            ServiceInstance choose = loadBalancerClient.choose("order-api");
            String host = choose.getHost();
            int port = choose.getPort();
            String url = String.format("http://%s:%s/ribbon/testApi", host, port);
            System.out.println(url);
            String forObject = new RestTemplate().getForObject(url, String.class);
            System.out.println(forObject);
        }
    }








}