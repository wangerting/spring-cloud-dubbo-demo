package com.wanget.user.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.user.api.entity.WebUserEntity;
import com.wanget.user.api.service.WebUserService;
import com.wanget.user.provider.dao.WebUserMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author Erting.Wang
 * @desciption 类说明
 * @date 2021/7/22 5:40 下午
 */
@DubboService
public class WebUserServiceImpl extends ServiceImpl<WebUserMapper, WebUserEntity> implements WebUserService
{
    @Override
    public String hello(String name) {
        return "hello,".concat(name).concat(",this is user web");
    }
}
