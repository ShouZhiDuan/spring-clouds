package com.clouds.dsz.impl;

import com.alibaba.fastjson.JSON;
import com.clouds.dsz.dto.order.OrderDTO;
import com.clouds.dsz.service.OrderService;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 订单服务
 */
@Slf4j
public class OrderServiceImpl implements OrderService {


    @Override
    public OrderDTO save(OrderDTO orderDTO) {
         log.info("订单保存成功：" + JSON.toJSONString(orderDTO));
        return orderDTO;
    }
}
