package com.wanget.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangerting
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DubboGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboGatewayApplication.class, args);
    }

}
