package com.wanget.user.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.user.api.entity.WebUserinfoEntity;
import com.wanget.user.api.service.WebUserinfoService;
import com.wanget.user.provider.dao.WebUserinfoMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * (WebUserinfo)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-16 16:32:09
 */
@DubboService
public class WebUserinfoServiceImpl extends ServiceImpl<WebUserinfoMapper, WebUserinfoEntity> implements WebUserinfoService {


}
