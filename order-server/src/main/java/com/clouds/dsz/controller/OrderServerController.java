package com.clouds.dsz.controller;

import com.clouds.dsz.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    //如果需要调用本地的service则可以使用@Qualifier
    //@Qualifier("orderServiceImpl")
    private OrderService orderService;

    @GetMapping("/api")
    public Object test(){
        return orderService.order();
    }

}
