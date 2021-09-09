package com.clouds.dsz.controller;

import com.alibaba.fastjson.JSON;
import com.clouds.dsz.dto.user.UserDTO;
import com.clouds.dsz.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 应用在方法上的降级或者熔断
 */
@RestController
public class HystrixCommandController {

//    @Autowired
//    RestTemplate restTemplate;

    RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private UserService userService;

    @HystrixCommand(commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled",value ="true"),
            //10秒内调用的次数
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "5"),
            //熔断时长5秒。
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "5000"),
            //10秒内的5次调用，错误率为50%就会触发熔断。
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "50")
    },fallbackMethod = "fallback")
    @GetMapping("/hystrix/order/{num}")
    public String queryOrder(@PathVariable("num")int num){
        System.out.println("======6666666666666666======");
        if(num%2==0){
            return "正常访问";
        }
        //restTemplate.getForObject("http://localhost:8082/orders",String.class);
        //UserDTO user = userService.user();
        int a = 1/0;
        return JSON.toJSONString("OK");
    }


    public String fallback(int num){
        return "======熔断状态======";
    }


    @HystrixCommand(fallbackMethod ="timeoutFallback",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000"),
    })
    @GetMapping("/hystrix/timeout")
    public String queryOrderTimeout(){
        return  restTemplate.getForObject("http://localhost:8082/orders",String.class);
    }


    //============================================
    @RequestMapping("/cf/always-exception")
    @HystrixCommand(fallbackMethod = "getServerPortError",commandProperties = {
            @HystrixProperty(name="circuitBreaker.enabled",value ="true"),
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "30"),
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "5000"),
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "50")
    })
    public String alwaysException(Boolean flag) {
        if(flag) throw new RuntimeException();
        return "hi";
    }

    public String getServerPortError(Boolean flag) {
        return "ribbon method getMovies occur hystrix";
    }



}
