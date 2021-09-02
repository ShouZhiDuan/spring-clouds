package com.ribbon.dsz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: ShouZhi@Duan
 * @Description:
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonClientController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;


    /**
     * Ribbon拦截RestTemplate实现负载均衡
     */
    @GetMapping("/client")
    public Object test(){
        String hostName = "http://ribbon-server/ribbon/test";
        return restTemplate.getForObject(hostName,String.class);
    }



    /**
     * LoadBalancerClient实现url直连调用
     */
    @GetMapping("/loadBalancerClient")
    public Object loadBalancerClient(){
        ServiceInstance choose = loadBalancerClient.choose("ribbon-server");
        String host = choose.getHost();
        int port = choose.getPort();
        String url = String.format("http://%s:%s/ribbon/test", host, port);
        System.out.println(url);
        String forObject = new RestTemplate().getForObject(url, String.class);
        System.out.println(forObject);
        return forObject;
    }



}
