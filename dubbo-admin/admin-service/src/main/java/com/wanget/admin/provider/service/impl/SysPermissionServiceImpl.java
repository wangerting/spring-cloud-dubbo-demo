package com.wanget.admin.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.admin.api.entity.SysPermissionEntity;
import com.wanget.admin.api.service.SysPermissionService;
import com.wanget.admin.provider.dao.SysPermissionMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * (SysPermission)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-19 17:46:14
 */
@DubboService
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermissionEntity> implements SysPermissionService {


}
