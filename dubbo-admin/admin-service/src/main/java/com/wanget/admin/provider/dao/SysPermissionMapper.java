package com.wanget.admin.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.admin.api.entity.SysPermissionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * (SysPermission)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-19 17:46:10
 */
@Mapper
public interface SysPermissionMapper extends BaseMapper<SysPermissionEntity> {

}
