package com.wanget.cms.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.cms.api.entity.CmsTagEntity;
import com.wanget.cms.api.service.CmsTagService;
import com.wanget.cms.provider.dao.CmsTagMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 关键词(CmsTag)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:14:30
 */
@DubboService
public class CmsTagServiceImpl extends ServiceImpl<CmsTagMapper, CmsTagEntity> implements CmsTagService {


}
