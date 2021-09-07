package com.clouds.dsz.controller;

import com.clouds.dsz.dto.order.OrderDTO;
import com.clouds.dsz.dto.user.UserDTO;
import com.clouds.dsz.feign_client.OrderServiceFeignClient;
import com.clouds.dsz.service.OrderService;
import com.clouds.dsz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 订单服务控制器
 */
@RestController
@RequestMapping("/order")
public class OrderController {

//    @Autowired
//    private OrderService orderService;


    @Autowired
    private OrderServiceFeignClient orderService;


    @Autowired
    private UserService userService;

    /**
     * 保存订单
     */
    @PostMapping("/save")
    public OrderDTO save(@RequestBody OrderDTO order){
        return orderService.save(order);
    }

    /**
     * 查询订单
     */
    @GetMapping("/details")
    public OrderDTO details(){
        return orderService.order();
    }

    /**
     * 用户注册
     */
    @PostMapping("/user/save")
    public Object userSave(){
        userService.save(new UserDTO());
        return "保存用户成功";
    }



}
