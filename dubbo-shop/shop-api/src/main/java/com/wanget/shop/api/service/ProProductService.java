package com.wanget.shop.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanget.shop.api.entity.ProProductEntity;

import java.util.List;

/**
 * (ProProduct)表服务接口
 *
 * @author Erting.Wang
 * @since 2021-07-16 14:28:51
 */
public interface ProProductService extends IService<ProProductEntity> {
    /**
     * 批量减库存
     *
     * @param entityList
     * @return boolean
     * @throws
     * @author Erting.Wang
     * @date 2021/7/26 11:00 上午
     */
    boolean batchReduceInventory(List<ProProductEntity> entityList);
}
