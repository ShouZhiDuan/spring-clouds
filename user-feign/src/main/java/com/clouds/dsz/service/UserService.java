package com.clouds.dsz.service;

import com.clouds.dsz.dto.user.UserDTO;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 用户服务接口
 */
public interface UserService {
    /**
     * 用户注册
     */
    UserDTO save(UserDTO userDTO);
}
