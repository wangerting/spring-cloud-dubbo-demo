package com.wanget.cms.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.cms.api.entity.CmsArticleTypeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章类型(CmsArticleType)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:13:13
 */
@Mapper
public interface CmsArticleTypeMapper extends BaseMapper<CmsArticleTypeEntity> {

}
