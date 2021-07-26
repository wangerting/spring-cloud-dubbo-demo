package com.wanget.user.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.user.api.entity.WebPublicAreasEntity;
import com.wanget.user.api.service.WebPublicAreasService;
import com.wanget.user.provider.dao.WebPublicAreasMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 各国城市列表(WebPublicAreas)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-16 16:28:48
 */
@DubboService
public class WebPublicAreasServiceImpl extends ServiceImpl<WebPublicAreasMapper, WebPublicAreasEntity> implements WebPublicAreasService {


}
