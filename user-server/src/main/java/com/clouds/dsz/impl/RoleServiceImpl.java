package com.clouds.dsz.impl;

import com.clouds.dsz.dto.role.RoleDTO;
import com.clouds.dsz.service.RoleService;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ShouZhi@Duan
 * @Description:
 */
@RestController
public class RoleServiceImpl implements RoleService {
    @Override
    public List<RoleDTO> roles() {
        int a = 1/0;
        List<RoleDTO> roles = new ArrayList<>();
        roles.add(new RoleDTO("roleName1"));
        roles.add(new RoleDTO("roleName2"));
        return roles;
    }
}
