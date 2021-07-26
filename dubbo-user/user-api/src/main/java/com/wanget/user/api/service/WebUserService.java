package com.wanget.user.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanget.user.api.entity.WebUserEntity;

/**
 * (WebUser)表服务接口
 *
 * @author Erting.Wang
 * @since 2021-07-12 16:58:37
 */
public interface WebUserService extends IService<WebUserEntity> {
    String hello(String name);
}
