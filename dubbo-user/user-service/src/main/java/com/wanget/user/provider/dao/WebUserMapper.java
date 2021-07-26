package com.wanget.user.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.user.api.entity.WebUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * (WebUser)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-12 17:50:48
 */
@Mapper
public interface WebUserMapper extends BaseMapper<WebUserEntity> {

}
