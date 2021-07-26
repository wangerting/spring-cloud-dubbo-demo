package com.wanget.order.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.wanget.order.api.dto.OrderDto;
import com.wanget.order.api.dto.ProductDto;
import com.wanget.order.api.entity.WebOrderEntity;
import com.wanget.order.api.entity.WebOrderProductEntity;
import com.wanget.order.api.enums.*;
import com.wanget.order.api.service.WebOrderProductService;
import com.wanget.order.api.service.WebOrderService;
import com.wanget.order.provider.dao.WebOrderMapper;
import com.wanget.shop.api.entity.ProProductEntity;
import com.wanget.shop.api.service.ProProductService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 订单(WebOrder)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-19 12:03:02
 */
@DubboService
public class WebOrderServiceImpl extends ServiceImpl<WebOrderMapper, WebOrderEntity> implements WebOrderService {

    @DubboReference
    ProProductService proProductService;
    @Resource
    WebOrderProductService webOrderProductService;

    /**
     * 创建订单
     *
     * @param order
     * @return boolean
     * @throws
     * @author Erting.Wang
     * @date 2021/7/23 6:20 下午
     */
    @Override
    @GlobalTransactional(rollbackFor = Exception.class)//全局事务控制
    public boolean createOrder(OrderDto order) {
        WebOrderEntity orderEntity = new WebOrderEntity();
        orderEntity.setUserId(order.getUserId());
        orderEntity.setUsername(order.getUsername());
        orderEntity.setOrderStatus(OrderStatusEnum.UNPAID_1);
        orderEntity.setDeliveryStatus(DeliveryStatusEnum.OUT_OF_STOCK_1);
        orderEntity.setRefundStatus(RefundStatusEnum.REVIEW_2);
        orderEntity.setPayType(PayTypeEnum.UNKNOWN_0);
        orderEntity.setDeliveryMethod(DeliveryMethodEnum.UNKNOWN_0);
        List<Integer> productIds = order.getProducts().stream()
                .map(ProductDto::getProductId).collect(Collectors.toList());
        Map<Integer, Integer> productMap = order.getProducts().stream()
                .collect(Collectors.toMap(ProductDto::getProductId, a -> a.getQuantity()));
        List<ProProductEntity> products = proProductService.listByIds(productIds);
        BigDecimal amount = BigDecimal.ZERO;
        BigDecimal amountPayable = BigDecimal.ZERO;

        for (ProProductEntity product : products) {
            Integer quantity = productMap.get(product.getId());
            amount = amount.add(product.getPrice()
                    .multiply(BigDecimal.valueOf(quantity)));
            amountPayable = amountPayable.add(product.getSalePrice()
                    .multiply(BigDecimal.valueOf(quantity)));
            product.setStock(product.getStock() - quantity);
            product.setUtime(new Date());
        }
        orderEntity.setAmount(amount);
        orderEntity.setAmountPayable(amountPayable);
        orderEntity.setCtime(new Date());

        if (baseMapper.insert(orderEntity) > 0) {
            List<WebOrderProductEntity> orderProducts = Lists.newArrayList();
            for (ProProductEntity product : products) {
                Integer quantity = productMap.get(product.getId());
                WebOrderProductEntity orderProductEntity = new WebOrderProductEntity();
                orderProductEntity.setOrderId(orderEntity.getId());
                orderProductEntity.setProductId(product.getId());
                orderProductEntity.setShopId(product.getShopId());
                orderProductEntity.setUserId(order.getUserId());
                orderProductEntity.setProductName(product.getName());
                orderProductEntity.setQuantity(productMap.get(product.getId()));
                orderProductEntity.setAmount(product.getPrice().multiply(BigDecimal.valueOf(quantity)));
                orderProductEntity.setAmountPayable(product.getSalePrice().multiply(BigDecimal.valueOf(quantity)));
                orderProductEntity.setCtime(new Date());
                orderProductEntity.setOrderStatus(OrderStatusEnum.UNPAID_1);
                orderProductEntity.setDeliveryStatus(DeliveryStatusEnum.OUT_OF_STOCK_1);
                orderProductEntity.setRefundStatus(RefundStatusEnum.UNKNOWN_0);
                orderProducts.add(orderProductEntity);
            }
            if (webOrderProductService.saveBatch(orderProducts)) {
                return proProductService.batchReduceInventory(products);
            }
        }
        return false;
    }
}
