package com.wanget.admin.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.admin.api.entity.SysUserEntity;
import com.wanget.admin.api.service.SysUserService;
import com.wanget.admin.provider.dao.SysUserMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author Erting.Wang
 * @desciption 类说明
 * @date 2021/7/22 5:40 下午
 */
@DubboService
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUserEntity> implements SysUserService
{
    @Override
    public String hello(String name) {
        return "hello,".concat(name).concat(",this is user admin");
    }
}
