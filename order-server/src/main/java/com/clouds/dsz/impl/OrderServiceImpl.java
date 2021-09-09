package com.clouds.dsz.impl;

import com.alibaba.fastjson.JSON;
import com.clouds.dsz.dto.order.OrderDTO;
import com.clouds.dsz.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 订单服务
 */
@Slf4j
@RestController
public class OrderServiceImpl implements OrderService {

    @Value("${server.port}")
    private String port;

    @Override
    public OrderDTO save(OrderDTO orderDTO) {
        System.out.println("======保存订单======");
        int a = 1/0;
        orderDTO.setOrderName(orderDTO.getOrderName()+ " " + port);
        return orderDTO;
    }

    @Override
    public OrderDTO order() {
        System.out.println("======查询订单======");
        int a = 1/0;
        return new OrderDTO("订单名称 " + port, 1);
    }


}
