package com.openfeign.dsz.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: ShouZhi@Duan
 * @Description:
 * user-api:服务名，可以是本地配置的listOfServers也可以是通过注册中心服务发现。
 */
@FeignClient(name = "user-api")
//Either 'name' or 'value' must be provided in @FeignClient
//@FeignClient(name = "user-api",url = "${user-api.url}")
public interface RibbonTestService {

     @GetMapping("/ribbon/test")
     String test();

}
