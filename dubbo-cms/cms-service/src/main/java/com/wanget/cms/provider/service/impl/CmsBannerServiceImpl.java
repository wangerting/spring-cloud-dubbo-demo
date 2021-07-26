package com.wanget.cms.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.cms.api.entity.CmsBannerEntity;
import com.wanget.cms.api.service.CmsBannerService;
import com.wanget.cms.provider.dao.CmsBannerMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * banner(CmsBanner)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:14:30
 */
@DubboService
public class CmsBannerServiceImpl extends ServiceImpl<CmsBannerMapper, CmsBannerEntity> implements CmsBannerService {


}
