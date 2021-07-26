package com.wanget.shop.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.shop.api.entity.ProShopEntity;
import com.wanget.shop.api.service.ProShopService;
import com.wanget.shop.provider.dao.ProShopMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 店铺(ProShop)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-16 16:44:09
 */
@DubboService
public class ProShopServiceImpl extends ServiceImpl<ProShopMapper, ProShopEntity> implements ProShopService {


}
