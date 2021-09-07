package com.clouds.dsz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ShouZhi@Duan
 * @Description: Ribbon接口测试
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonDemoController {

    /**
     * 可以将当前项目改变端口，启动不同的服务，用于测试负载均衡。
     */
    @Value("${server.port}")
    private Integer port;

    /**
     * Ribbon接口
     */
    @GetMapping("/testApi")
    public Object testApi(String name){
        return  name + " " + port;
    }


}
