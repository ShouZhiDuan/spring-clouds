package com.clouds.dsz.service;

import com.clouds.dsz.dto.order.OrderDTO;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 订单接口
 */
public interface OrderService {
    /**
     * 保存订单
     */
     OrderDTO save(OrderDTO orderDTO);
}
