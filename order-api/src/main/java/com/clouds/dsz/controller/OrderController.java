package com.clouds.dsz.controller;

import com.clouds.dsz.dto.order.OrderDTO;
import com.clouds.dsz.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 订单服务控制器
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 保存订单
     */
    @PostMapping("/save")
    public OrderDTO save(@RequestBody OrderDTO order){
        return orderService.save(order);
    }

}
