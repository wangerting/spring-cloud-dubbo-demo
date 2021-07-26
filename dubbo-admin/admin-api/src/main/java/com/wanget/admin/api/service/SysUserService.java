package com.wanget.admin.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanget.admin.api.entity.SysUserEntity;

/**
 * (SysUser)表服务接口
 *
 * @author Erting.Wang
 * @since 2021-07-19 17:46:17
 */
public interface SysUserService extends IService<SysUserEntity> {

    String hello(String name);
}
