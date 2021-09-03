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
        log.info("订单保存成功：" + JSON.toJSONString(orderDTO));
        orderDTO.setOrderName(orderDTO.getOrderName()+ " " + port);
        return orderDTO;
    }

    @Override
    public OrderDTO order() {
        log.info("======查询订单======");
        return new OrderDTO("订单名称 " + port);
    }


}
