package com.wanget.order.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.order.api.entity.WebOrderProductEntity;
import com.wanget.order.api.service.WebOrderProductService;
import com.wanget.order.provider.dao.WebOrderProductMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 订单与产品关联表(WebOrderProduct)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-19 12:03:07
 */
@DubboService
public class WebOrderProductServiceImpl extends ServiceImpl<WebOrderProductMapper, WebOrderProductEntity> implements WebOrderProductService {


}
