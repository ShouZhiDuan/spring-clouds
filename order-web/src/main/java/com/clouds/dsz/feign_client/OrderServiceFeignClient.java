package com.clouds.dsz.feign_client;

import com.clouds.dsz.service.OrderService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Auther: ShouZhi@Duan
 * @Description: 如果需要扩展就写当前类，不需要扩展就直接使用OrderService。
 */
@FeignClient(name = "order-server")
public interface OrderServiceFeignClient extends OrderService {

}
