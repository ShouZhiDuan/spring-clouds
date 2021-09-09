package com.clouds.dsz.controller;

import com.clouds.dsz.dto.order.OrderDTO;
import com.clouds.dsz.dto.user.UserDTO;
import com.clouds.dsz.service.OrderService;
import com.clouds.dsz.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 全局feign熔断或者降级
 */
@Slf4j
@RestController
@RequestMapping("/user-web")
public class HystrixFeignController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserService userService;

    /**
     * Hystrix超时->降级测试
     */
    @PostMapping("/saveOrder")
    public Object saveOrder(@RequestBody OrderDTO orderDTO) throws InterruptedException {
        //1、注册用户
        UserDTO user = userService.save(new UserDTO("dsz","123456"));
        //2、购买订单 Hystrix超时测试
        OrderDTO order = orderService.save(orderDTO);
        return "OK";
    }


    /**
     * Hystrix熔断->降级测试
     */
    @GetMapping("/test")
    public Object test(@RequestParam("flag") int flag) throws InterruptedException {
        log.info("======Hystrix熔断->降级测试======");
        if(flag%2 == 0){
            return "======正常访问======";
        }
        OrderDTO orderDTO = new OrderDTO("test",1);
        OrderDTO order = orderService.save(orderDTO);
        System.out.println("======继续执行操作======");
        return order;
    }

}
