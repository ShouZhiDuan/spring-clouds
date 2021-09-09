package com.clouds.dsz.service;

import com.clouds.dsz.dto.role.RoleDTO;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
 * @Auther: ShouZhi@Duan
 * @Description:
 */
@Component
public class RoleServiceFallbackFactory implements FallbackFactory<RoleService> {
    @Override
    public RoleService create(Throwable throwable) {
        return new RoleService() {
            @Override
            public List<RoleDTO> roles() {
                String msg = throwable.getMessage();
                System.out.printf("msg");
                return Collections.emptyList();
            }
        };
    }
}
