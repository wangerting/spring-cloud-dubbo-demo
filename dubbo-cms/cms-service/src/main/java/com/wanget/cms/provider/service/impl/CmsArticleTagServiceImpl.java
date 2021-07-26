package com.wanget.cms.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.cms.api.entity.CmsArticleTagEntity;
import com.wanget.cms.api.service.CmsArticleTagService;
import com.wanget.cms.provider.dao.CmsArticleTagMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * (CmsArticleTag)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:13:12
 */
@DubboService
public class CmsArticleTagServiceImpl extends ServiceImpl<CmsArticleTagMapper, CmsArticleTagEntity> implements CmsArticleTagService {


}
