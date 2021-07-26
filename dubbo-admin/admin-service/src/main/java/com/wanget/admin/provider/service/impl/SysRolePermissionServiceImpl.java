package com.wanget.admin.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.admin.api.entity.SysRolePermissionEntity;
import com.wanget.admin.api.service.SysRolePermissionService;
import com.wanget.admin.provider.dao.SysRolePermissionMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * (SysRolePermission)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-19 17:46:17
 */
@DubboService
public class SysRolePermissionServiceImpl extends ServiceImpl<SysRolePermissionMapper, SysRolePermissionEntity> implements SysRolePermissionService {


}
