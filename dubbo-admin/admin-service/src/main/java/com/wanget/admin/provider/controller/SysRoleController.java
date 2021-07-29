package com.wanget.admin.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.admin.api.entity.SysRoleEntity;
import com.wanget.admin.api.service.SysRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * (SysRole)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 14:12:57
 */
@RestController
@RequestMapping("/sysRole")
@Api(value = "sysRole", tags = "角色相关接口")
@Slf4j
public class SysRoleController {
    /**
     * 服务对象
     */
    @Resource
    private SysRoleService sysRoleService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取角色详情|王二廷|540805105@qq.com")
    public RespModel<SysRoleEntity> get(@PathVariable Long id) {
        SysRoleEntity entity = sysRoleService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除角色|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(sysRoleService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加角色|王二廷|540805105@qq.com")
    public RespModel<SysRoleEntity> save(@RequestBody SysRoleEntity entity) {
        log.info("entity={}", entity);
        if (sysRoleService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新角色信息|王二廷|540805105@qq.com")
    public RespModel<SysRoleEntity> update(@RequestBody SysRoleEntity entity) {
        log.info("entity={}", entity);
        if (sysRoleService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取角色列表|王二廷|540805105@qq.com")
    public RespModel<Page<SysRoleEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<SysRoleEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<SysRoleEntity> wrapper = new LambdaQueryWrapper<SysRoleEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(SysRoleEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(SysRoleEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<SysRoleEntity> entityIPage = sysRoleService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
