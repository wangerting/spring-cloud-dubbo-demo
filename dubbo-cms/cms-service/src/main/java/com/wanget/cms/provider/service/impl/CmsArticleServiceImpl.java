package com.wanget.cms.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.cms.api.entity.CmsArticleEntity;
import com.wanget.cms.api.service.CmsArticleService;
import com.wanget.cms.provider.dao.CmsArticleMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 文章(CmsArticle)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:13:09
 */
@DubboService
public class CmsArticleServiceImpl extends ServiceImpl<CmsArticleMapper, CmsArticleEntity> implements CmsArticleService {


}
