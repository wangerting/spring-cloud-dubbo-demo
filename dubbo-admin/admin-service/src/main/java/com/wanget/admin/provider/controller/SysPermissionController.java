package com.wanget.admin.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.admin.api.entity.SysPermissionEntity;
import com.wanget.admin.api.service.SysPermissionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 权限(SysPermission)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 14:12:57
 */
@RestController
@RequestMapping("/sysPermission")
@Api(value = "sysPermission", tags = "权限相关接口")
@Slf4j
public class SysPermissionController {
    /**
     * 服务对象
     */
    @Resource
    private SysPermissionService sysPermissionService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取权限详情|王二廷|540805105@qq.com")
    public RespModel<SysPermissionEntity> get(@PathVariable Long id) {
        SysPermissionEntity entity = sysPermissionService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除权限|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(sysPermissionService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加权限|王二廷|540805105@qq.com")
    public RespModel<SysPermissionEntity> save(@RequestBody SysPermissionEntity entity) {
        log.info("entity={}", entity);
        if (sysPermissionService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新信息|王二廷|540805105@qq.com")
    public RespModel<SysPermissionEntity> update(@RequestBody SysPermissionEntity entity) {
        log.info("entity={}", entity);
        if (sysPermissionService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取权限列表|王二廷|540805105@qq.com")
    public RespModel<Page<SysPermissionEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<SysPermissionEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<SysPermissionEntity> wrapper = new LambdaQueryWrapper<SysPermissionEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(SysPermissionEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(SysPermissionEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<SysPermissionEntity> entityIPage = sysPermissionService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
