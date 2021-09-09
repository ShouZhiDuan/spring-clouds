package com.clouds.dsz.service;

import com.clouds.dsz.dto.order.OrderDTO;
import org.springframework.stereotype.Component;

/**
 * @Auther: ShouZhi@Duan
 * @Description:
 */
@Component
public class OrderServcideFeignFallBack implements OrderService {

    @Override
    public OrderDTO save(OrderDTO orderDTO) {
        System.out.println("======保存订单超时======");
        return new OrderDTO("======保存订单超时======",1);
    }

    @Override
    public OrderDTO order() {
        System.out.println("======查询订单超时======");
        return new OrderDTO("======查询订单超时======",1);
    }
}
