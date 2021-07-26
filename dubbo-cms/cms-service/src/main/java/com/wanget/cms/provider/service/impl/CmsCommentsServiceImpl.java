package com.wanget.cms.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.cms.api.entity.CmsCommentsEntity;
import com.wanget.cms.api.service.CmsCommentsService;
import com.wanget.cms.provider.dao.CmsCommentsMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 评论(CmsComments)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:14:30
 */
@DubboService
public class CmsCommentsServiceImpl extends ServiceImpl<CmsCommentsMapper, CmsCommentsEntity> implements CmsCommentsService {


}
