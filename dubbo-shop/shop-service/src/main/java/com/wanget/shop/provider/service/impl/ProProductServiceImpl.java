package com.wanget.shop.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.shop.api.entity.ProProductEntity;
import com.wanget.shop.api.service.ProProductService;
import com.wanget.shop.provider.dao.ProProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;

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
    public boolean batchReduceInventory(List<ProProductEntity> entityList) {
        log.info("entityList={}", entityList);
        return super.updateBatchById(entityList);
    }
}
