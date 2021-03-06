package com.wanget.user.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.user.api.entity.WebUserEntity;
import com.wanget.user.api.service.WebUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author Erting.Wang
 * @desciption 类说明
 * @date 2021/7/23 9:45 上午
 */
@RestController
@RequestMapping("/webUser")
@Api(value = "webUser", tags = "用户相关接口")
@Slf4j
public class WebUserController {

    @Resource
    WebUserService webUserService;

    @GetMapping("/hello")
    public String hello(String name) {
        return webUserService.hello(name);
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取用户详情|王二廷|540805105@qq.com")
    public RespModel<WebUserEntity> get(@PathVariable Long id) {
        WebUserEntity entity = webUserService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除用户|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(webUserService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加用户|王二廷|540805105@qq.com")
    public RespModel<WebUserEntity> save(@RequestBody WebUserEntity entity) {
        log.info("entity={}", entity);
        if (webUserService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新用户信息|王二廷|540805105@qq.com")
    public RespModel<WebUserEntity> update(@RequestBody WebUserEntity entity) {
        log.info("entity={}", entity);
        if (webUserService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取用户列表|王二廷|540805105@qq.com")
    public RespModel<Page<WebUserEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<WebUserEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<WebUserEntity> wrapper = new LambdaQueryWrapper<WebUserEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(WebUserEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(WebUserEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<WebUserEntity> entityIPage = webUserService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
