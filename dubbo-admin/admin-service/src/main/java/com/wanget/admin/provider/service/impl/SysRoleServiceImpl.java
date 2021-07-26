package com.wanget.admin.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.admin.api.entity.SysRoleEntity;
import com.wanget.admin.api.service.SysRoleService;
import com.wanget.admin.provider.dao.SysRoleMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * (SysRole)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-19 17:46:17
 */
@DubboService
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRoleEntity> implements SysRoleService {


}
