package com.clouds.dsz;

import com.clouds.dsz.service.RoleService;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

@EnableFeignClients
@SpringBootApplication
public class UserServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(UserServerApplication.class, args);
        ConfigurableListableBeanFactory beanFactory = run.getBeanFactory();
        Map<String, RoleService> beansOfType = beanFactory.getBeansOfType(RoleService.class);
        System.out.println(beansOfType);
    }

}
