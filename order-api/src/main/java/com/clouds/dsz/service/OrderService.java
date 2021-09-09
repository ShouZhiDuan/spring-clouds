package com.clouds.dsz.service;

import com.clouds.dsz.dto.order.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 订单接口
 */
@FeignClient(name = "order-server",fallback = OrderServcideFeignFallBack.class)
public interface OrderService {
    /**
     * 保存订单
     */
     @PostMapping("/order/save")
     OrderDTO save(@RequestBody OrderDTO orderDTO) throws InterruptedException;

    /**
     * 查询订单
     */
    @GetMapping("/order")
    OrderDTO order();
}
