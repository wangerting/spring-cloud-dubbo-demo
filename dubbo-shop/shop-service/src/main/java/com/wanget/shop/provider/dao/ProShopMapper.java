package com.wanget.shop.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.shop.api.entity.ProShopEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 店铺(ProShop)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-16 16:43:36
 */
@Mapper
public interface ProShopMapper extends BaseMapper<ProShopEntity> {

}
