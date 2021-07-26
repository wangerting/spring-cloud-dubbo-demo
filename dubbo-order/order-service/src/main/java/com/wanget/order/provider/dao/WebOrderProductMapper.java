package com.wanget.order.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.order.api.entity.WebOrderProductEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单与产品关联表(WebOrderProduct)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-19 12:03:07
 */
@Mapper
public interface WebOrderProductMapper extends BaseMapper<WebOrderProductEntity> {

}
