package com.clouds.dsz.impl;

import com.alibaba.fastjson.JSON;
import com.clouds.dsz.dto.user.UserDTO;
import com.clouds.dsz.service.UserService;
import lombok.extern.slf4j.Slf4j;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 用户服务
 */
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public UserDTO save(UserDTO userDTO) {
        log.info("用户注册成功：" + JSON.toJSONString(userDTO));
        return userDTO;
    }
}
