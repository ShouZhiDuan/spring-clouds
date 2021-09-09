package com.clouds.dsz.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 用户数据
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String username;
    private String passWord;
}
