package com.wanget.user.provider.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wanget.user.api.entity.WebUserAddressEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户收货地址(WebUserAddress)表数据库访问层
 *
 * @author Erting.Wang
 * @since 2021-07-16 16:30:15
 */
@Mapper
public interface WebUserAddressMapper extends BaseMapper<WebUserAddressEntity> {

}
