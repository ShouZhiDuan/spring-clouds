package com.clouds.dsz;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

/**
 * Ribbon测试
 */
@SpringBootTest
class RibbonTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    void contextLoads() {
        while (true){
            String forObject = restTemplate.getForObject("http://order-api/ribbon/testApi", String.class);
            System.out.println(forObject);
        }
    }

}
