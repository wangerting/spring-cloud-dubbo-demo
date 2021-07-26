package com.wanget.cms.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.cms.api.entity.CmsArticleTagEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * (CmsArticleTag)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:13:10
 */
@Mapper
public interface CmsArticleTagMapper extends BaseMapper<CmsArticleTagEntity> {

}
