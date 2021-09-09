package com.clouds.dsz.service;

import com.clouds.dsz.dto.user.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 用户服务接口
 */
@FeignClient(value = "user-server",contextId = "com.clouds.dsz.service.UserService")
public interface UserService {
    /**
     * 用户注册
     */
    @PostMapping("/save")
    UserDTO save(UserDTO userDTO);

    /**
     * 查询用户信息
     */
    @GetMapping("/user")
    UserDTO user();
}
