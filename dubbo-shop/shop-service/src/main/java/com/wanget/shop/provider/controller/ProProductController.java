package com.wanget.shop.provider.controller;

import com.wanget.shop.api.entity.ProProductEntity;
import com.wanget.shop.api.service.ProProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Erting.Wang
 * @desciption 类说明
 * @date 2021/7/23 12:09 下午
 */
@RestController
@RequestMapping("/proProduct")
@Api(value = "proProduct", tags = "产品相关接口")
@Slf4j
public class ProProductController {
    @Resource
    ProProductService proProductService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取产品详情|王二廷|540805105@qq.com")
    public ProProductEntity get(@PathVariable Long id) {
        ProProductEntity productEntity = proProductService.getById(id);
        log.info("productEntity={}", productEntity);
        return productEntity;
    }
}
