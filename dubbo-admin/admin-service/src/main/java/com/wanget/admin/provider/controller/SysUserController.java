package com.wanget.admin.provider.controller;

import com.wanget.admin.api.entity.SysUserEntity;
import com.wanget.admin.api.service.SysUserService;
import com.wanget.user.api.entity.WebUserEntity;
import com.wanget.user.api.service.WebUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Erting.Wang
 * @desciption 类说明
 * @date 2021/7/22 6:07 下午
 */
@RestController
@RequestMapping("/sysUser")
@Api(value = "sysUser", tags = "系统管理员相关接口")
@Slf4j
public class SysUserController {

    @DubboReference
    WebUserService webUserService;
    @Resource
    SysUserService sysUserService;

    @GetMapping("/helloAdmin")
    @ApiOperation(value = "hellAdmin|王二廷|540805105@qq.com")
    public String helloAdmin(String name) {
        return sysUserService.hello(name);
    }

    @GetMapping("/helloWeb")
    @ApiOperation(value = "helloWeb|王二廷|540805105@qq.com")
    public String hello(String name) {
        return webUserService.hello(name);
    }

    @GetMapping("/getWebUser/{id}")
    @ApiOperation(value = "getWebUser|王二廷|540805105@qq.com")
    public WebUserEntity getWebUser(@PathVariable Long id) {
        log.info("web-user-id={}", id);
        return webUserService.getById(id);
    }

    @GetMapping("/getAdminUser/{id}")
    @ApiOperation(value = "getAdminUser|王二廷|540805105@qq.com")
    public SysUserEntity getAdminUser(@PathVariable Long id) {
        log.info("admin-user-id={}", id);
        return sysUserService.getById(id);
    }
}
