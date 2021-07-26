package com.wanget.shop.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.shop.api.entity.ProProductEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * (ProProduct)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-16 16:43:15
 */
@Mapper
public interface ProProductMapper extends BaseMapper<ProProductEntity> {

}
