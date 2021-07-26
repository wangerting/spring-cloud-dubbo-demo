package com.wanget.user.provider.controller;

import com.wanget.user.api.entity.WebUserEntity;
import com.wanget.user.api.service.WebUserService;
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
 * @date 2021/7/23 9:45 上午
 */
@RestController
@RequestMapping("/webUser")
@Api(value = "webUser", tags = "用户相关接口")
@Slf4j
public class WebUserController {

    @Resource
    WebUserService webUserService;


    @GetMapping("/hello")
    public String hello(String name) {
        return webUserService.hello(name);
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取用户详情|王二廷|540805105@qq.com")
    public WebUserEntity get(@PathVariable Long id) {
        WebUserEntity userEntity = webUserService.getById(id);
        log.info("userEntity={}", userEntity);
        return userEntity;
    }


}
