package com.clouds.dsz.controller;

import com.clouds.dsz.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ShouZhi@Duan
 * @Description:
 */
@RestController
@RequestMapping("/order/server")
public class OrderServerController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/api")
    public Object test(){
        return orderService.order();
    }

}
