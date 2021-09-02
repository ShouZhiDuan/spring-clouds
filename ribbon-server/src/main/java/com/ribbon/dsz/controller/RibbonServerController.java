package com.ribbon.dsz.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ShouZhi@Duan
 * @Description:
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonServerController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/test")
    public Object test(){
        return port;
    }
}
