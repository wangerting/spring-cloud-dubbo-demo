package com.wanget.admin.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.admin.api.entity.SysUserEntity;
import com.wanget.admin.api.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * (SysUser)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 14:12:57
 */
@RestController
@RequestMapping("/sysUser")
@Api(value = "sysUser", tags = "管理员相关接口")
@Slf4j
public class SysUserController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserService sysUserService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取管理员详情|王二廷|540805105@qq.com")
    public RespModel<SysUserEntity> get(@PathVariable Long id) {
        SysUserEntity entity = sysUserService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除管理员|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(sysUserService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加管理员|王二廷|540805105@qq.com")
    public RespModel<SysUserEntity> save(@RequestBody SysUserEntity entity) {
        log.info("entity={}", entity);
        if (sysUserService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新管理员信息|王二廷|540805105@qq.com")
    public RespModel<SysUserEntity> update(@RequestBody SysUserEntity entity) {
        log.info("entity={}", entity);
        if (sysUserService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取管理员列表|王二廷|540805105@qq.com")
    public RespModel<Page<SysUserEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<SysUserEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<SysUserEntity> wrapper = new LambdaQueryWrapper<SysUserEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(SysUserEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(SysUserEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<SysUserEntity> entityIPage = sysUserService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
