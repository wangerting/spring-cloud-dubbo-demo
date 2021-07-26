package com.wanget.shop.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.shop.api.entity.ProBrandEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌(ProBrand)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-16 16:40:05
 */
@Mapper
public interface ProBrandMapper extends BaseMapper<ProBrandEntity> {

}
