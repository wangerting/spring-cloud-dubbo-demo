package com.wanget.shop.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.shop.api.entity.ProCategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 产品分类(ProCategory)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-16 16:42:01
 */
@Mapper
public interface ProCategoryMapper extends BaseMapper<ProCategoryEntity> {

}
