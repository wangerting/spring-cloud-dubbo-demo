package com.wanget.shop.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.shop.api.entity.ProProductEntity;
import com.wanget.shop.api.service.ProProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * (ProProduct)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 13:56:00
 */
@RestController
@RequestMapping("/proProduct")
@Api(value = "proProduct", tags = "")
@Slf4j
public class ProProductController {
    /**
     * 服务对象
     */
    @Resource
    private ProProductService proProductService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取详情|王二廷|540805105@qq.com")
    public RespModel<ProProductEntity> get(@PathVariable Long id) {
        ProProductEntity entity = proProductService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(proProductService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加|王二廷|540805105@qq.com")
    public RespModel<ProProductEntity> save(@RequestBody ProProductEntity entity) {
        log.info("entity={}", entity);
        if (proProductService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新信息|王二廷|540805105@qq.com")
    public RespModel<ProProductEntity> update(@RequestBody ProProductEntity entity) {
        log.info("entity={}", entity);
        if (proProductService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取列表|王二廷|540805105@qq.com")
    public RespModel<Page<ProProductEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<ProProductEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<ProProductEntity> wrapper = new LambdaQueryWrapper<ProProductEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(ProProductEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(ProProductEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<ProProductEntity> entityIPage = proProductService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
