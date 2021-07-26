package com.wanget.shop.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.shop.api.entity.ProCategoryEntity;
import com.wanget.shop.api.service.ProCategoryService;
import com.wanget.shop.provider.dao.ProCategoryMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 产品分类(ProCategory)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-16 16:42:43
 */
@DubboService
public class ProCategoryServiceImpl extends ServiceImpl<ProCategoryMapper, ProCategoryEntity> implements ProCategoryService {


}
