package com.wanget.user.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.user.api.entity.WebUserAddressEntity;
import com.wanget.user.api.service.WebUserAddressService;
import com.wanget.user.provider.dao.WebUserAddressMapper;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 用户收货地址(WebUserAddress)表服务实现类
 *
 * @author Erting.Wang
 * @since 2021-07-16 16:31:45
 */
@DubboService
public class WebUserAddressServiceImpl extends ServiceImpl<WebUserAddressMapper, WebUserAddressEntity> implements WebUserAddressService {


}
