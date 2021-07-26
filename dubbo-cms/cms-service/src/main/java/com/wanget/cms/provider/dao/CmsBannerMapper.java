package com.wanget.cms.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.cms.api.entity.CmsBannerEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * banner(CmsBanner)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:14:30
 */
@Mapper
public interface CmsBannerMapper extends BaseMapper<CmsBannerEntity> {

}
