package com.wanget.cms.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.cms.api.entity.CmsCommentsEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 评论(CmsComments)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:14:30
 */
@Mapper
public interface CmsCommentsMapper extends BaseMapper<CmsCommentsEntity> {

}
