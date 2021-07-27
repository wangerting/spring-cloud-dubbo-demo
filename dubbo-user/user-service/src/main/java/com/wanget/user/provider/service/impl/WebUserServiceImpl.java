package com.wanget.user.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wanget.user.api.entity.WebUserEntity;
import com.wanget.user.api.service.WebUserService;
import com.wanget.user.provider.dao.WebUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import java.math.BigDecimal;

/**
 * @author Erting.Wang
 * @desciption 类说明
 * @date 2021/7/22 5:40 下午
 */
@DubboService
@Slf4j
public class WebUserServiceImpl extends ServiceImpl<WebUserMapper, WebUserEntity> implements WebUserService {
    @Override
    public String hello(String name) {
        return "hello,".concat(name).concat(",this is user web");
    }

    /**
     * 添加积分
     *
     * @param userId
     * @return void
     * @throws
     * @author Erting.Wang
     * @date 2021/7/27 4:50 下午
     */
    @Override
    public void integral(Integer userId) {
        throw new RuntimeException("用户添加积分失败，发生异常了");
    }

    /**
     * 用户扣款
     *
     * @param userId
     * @param money
     * @return void
     * @throws
     * @author Erting.Wang
     * @date 2021/7/27 4:51 下午
     */
    @Override
    public boolean deduction(Integer userId, BigDecimal money) {
        log.info("userId={},money={}", userId, money);
        if (money.compareTo(BigDecimal.TEN) > 0) {
            throw new RuntimeException("用户扣款失败，发生异常了");
        }
        log.info("扣款成功，金额={}", money);
        return true;

    }
}
