package com.wanget.order.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanget.order.api.dto.OrderDto;
import com.wanget.order.api.entity.WebOrderEntity;


/**
 * 订单(WebOrder)表服务接口
 *
 * @author Erting.Wang
 * @since 2021-07-19 11:36:22
 */
public interface WebOrderService extends IService<WebOrderEntity> {

    /**
     * 创建订单
     *
     * @param order
     * @return boolean
     * @throws
     * @author Erting.Wang
     * @date 2021/7/23 6:20 下午
     */
    boolean createOrder(OrderDto order);
}
