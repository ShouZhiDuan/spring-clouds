package com.clouds.dsz.service;

import com.clouds.dsz.dto.role.RoleDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

/**
 * @Auther: ShouZhi@Duan
 * @Description:
 */
@FeignClient(value = "user-server",fallbackFactory = RoleServiceFallbackFactory.class,contextId = "com.clouds.dsz.service.RoleService")
public interface RoleService {
    /**
     * 查询角色列表接口
     */
     @GetMapping("/roles")
     List<RoleDTO> roles();
}
