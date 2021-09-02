package com.openfeign.dsz.controller;

import com.openfeign.dsz.rpc.RibbonTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ShouZhi@Duan
 * @Description:
 */
@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private RibbonTestService ribbonService;

    @GetMapping("/test")
    public Object test(){
        return ribbonService.test();
    }
}
