package com.wanget.cms.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.cms.api.entity.CmsArticleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文章(CmsArticle)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:13:07
 */
@Mapper
public interface CmsArticleMapper extends BaseMapper<CmsArticleEntity> {

}
