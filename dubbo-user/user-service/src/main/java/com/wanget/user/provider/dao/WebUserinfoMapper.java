package com.wanget.user.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.user.api.entity.WebUserinfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * (WebUserinfo)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-16 16:31:00
 */
@Mapper
public interface WebUserinfoMapper extends BaseMapper<WebUserinfoEntity> {

}
