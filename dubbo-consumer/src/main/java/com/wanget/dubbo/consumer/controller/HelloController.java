package com.wanget.dubbo.consumer.controller;

import com.wanget.dubbo.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangerting
 * @Date: 2019/9/3
 * @Time: 22:14
 * Description:
 */
@RestController
public class HelloController {
    @DubboReference
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello("Dubbo!");
    }
}
