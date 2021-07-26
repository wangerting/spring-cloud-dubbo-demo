package com.wanget.cms.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.cms.api.entity.CmsArticleTypeEntity;
import com.wanget.cms.api.service.CmsArticleTypeService;
import com.wanget.cms.provider.dao.CmsArticleTypeMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 文章类型(CmsArticleType)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:13:13
 */
@DubboService
public class CmsArticleTypeServiceImpl extends ServiceImpl<CmsArticleTypeMapper, CmsArticleTypeEntity> implements CmsArticleTypeService {


}
