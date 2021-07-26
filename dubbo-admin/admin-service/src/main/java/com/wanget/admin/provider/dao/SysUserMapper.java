package com.wanget.admin.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.admin.api.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * (SysUser)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-19 17:46:17
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUserEntity> {

}
