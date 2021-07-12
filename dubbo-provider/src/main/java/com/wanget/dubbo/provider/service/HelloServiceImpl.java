package com.wanget.dubbo.provider.service;

import com.wanget.dubbo.api.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author wangerting
 * @Date: 2019/9/3
 * @Time: 21:55
 */
@DubboService
public class HelloServiceImpl implements HelloService {

    @Value("${name:韩美美}")
    private String name;

    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @Override
    public String hello(String name) {
        return "Hello " + name + " and " + this.name + ",provider-ip:" + ip;
    }
}
