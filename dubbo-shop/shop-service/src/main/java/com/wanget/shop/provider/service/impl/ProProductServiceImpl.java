package com.wanget.shop.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.shop.api.entity.ProProductEntity;
import com.wanget.shop.api.service.ProProductService;
import com.wanget.shop.provider.dao.ProProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * (ProProduct)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-16 16:43:55
 */
@DubboService
@Slf4j
public class ProProductServiceImpl extends ServiceImpl<ProProductMapper, ProProductEntity> implements ProProductService {


    /**
     * 批量减库存
     *
     * @param entityList
     * @return boolean
     * @throws
     * @author Erting.Wang
     * @date 2021/7/26 11:00 上午
     */
    @Override
    public boolean batchReduceInventory(Map<Integer, Integer> productMap) {
        log.info("productMap={}", productMap);
        List<ProProductEntity> entityList = baseMapper.selectBatchIds(productMap.keySet());
        List<ProProductEntity> collect = entityList.stream()
                .filter(p -> p.getStock() < productMap.get(p.getId())).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(collect)) {
            for (ProProductEntity entity : entityList) {
                entity.setStock(entity.getStock() - productMap.get(entity.getId()));
                entity.setUtime(new Date());
            }
            return super.updateBatchById(entityList);
        } else {
            throw new RuntimeException("产品库存不足，不能下单，请先补充库存！");
        }
    }
}
