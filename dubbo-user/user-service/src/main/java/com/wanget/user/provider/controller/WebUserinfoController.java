package com.wanget.user.provider.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.user.api.entity.WebUserinfoEntity;
import com.wanget.user.api.service.WebUserinfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;


/**
 * 用户详情(WebUserinfo)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 13:37:35
 */
@RestController
@RequestMapping("/webUserinfo")
@Api(value = "webUserinfo", tags = "用户详情相关接口")
@Slf4j
public class WebUserinfoController {
    /**
     * 服务对象
     */
    @Resource
    private WebUserinfoService webUserinfoService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取用户详情|王二廷|540805105@qq.com")
    public RespModel<WebUserinfoEntity> get(@PathVariable Long id) {
        WebUserinfoEntity entity = webUserinfoService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除用户|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(webUserinfoService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加用户|王二廷|540805105@qq.com")
    public RespModel<WebUserinfoEntity> save(@RequestBody WebUserinfoEntity entity) {
        log.info("entity={}", entity);
        if (webUserinfoService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新用户信息|王二廷|540805105@qq.com")
    public RespModel<WebUserinfoEntity> update(@RequestBody WebUserinfoEntity entity) {
        log.info("entity={}", entity);
        if (webUserinfoService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取用户列表|王二廷|540805105@qq.com")
    public RespModel<Page<WebUserinfoEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<WebUserinfoEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<WebUserinfoEntity> wrapper = new LambdaQueryWrapper<WebUserinfoEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(WebUserinfoEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(WebUserinfoEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<WebUserinfoEntity> entityIPage = webUserinfoService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
