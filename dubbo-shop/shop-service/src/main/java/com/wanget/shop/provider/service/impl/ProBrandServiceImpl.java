package com.wanget.shop.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.shop.api.entity.ProBrandEntity;
import com.wanget.shop.api.service.ProBrandService;
import com.wanget.shop.provider.dao.ProBrandMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 品牌(ProBrand)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-16 16:40:05
 */
@DubboService
public class ProBrandServiceImpl extends ServiceImpl<ProBrandMapper, ProBrandEntity> implements ProBrandService {


}
