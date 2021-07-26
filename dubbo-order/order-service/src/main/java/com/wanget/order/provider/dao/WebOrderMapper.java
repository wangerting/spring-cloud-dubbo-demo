package com.wanget.order.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.order.api.entity.WebOrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单(WebOrder)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-19 12:03:02
 */
@Mapper
public interface WebOrderMapper extends BaseMapper<WebOrderEntity> {

}
