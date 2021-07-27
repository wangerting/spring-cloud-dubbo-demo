package com.wanget.user.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wanget.user.api.entity.WebUserEntity;

import java.math.BigDecimal;

/**
 * (WebUser)表服务接口
 *
 * @author Erting.Wang
 * @since 2021-07-12 16:58:37
 */
public interface WebUserService extends IService<WebUserEntity> {

    String hello(String name);

    /**
     * 添加积分
     *
     * @param userId
     * @return void
     * @throws
     * @author Erting.Wang
     * @date 2021/7/27 4:50 下午
     */
    void integral(Integer userId);

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
    boolean deduction(Integer userId, BigDecimal money);
}
