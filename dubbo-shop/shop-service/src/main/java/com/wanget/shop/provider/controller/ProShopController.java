package com.wanget.shop.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.shop.api.entity.ProShopEntity;
import com.wanget.shop.api.service.ProShopService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 店铺(ProShop)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 13:56:02
 */
@RestController
@RequestMapping("/proShop")
@Api(value = "proShop", tags = "店铺")
@Slf4j
public class ProShopController {
    /**
     * 服务对象
     */
    @Resource
    private ProShopService proShopService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取店铺详情|王二廷|540805105@qq.com")
    public RespModel<ProShopEntity> get(@PathVariable Long id) {
        ProShopEntity entity = proShopService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除店铺|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(proShopService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加店铺|王二廷|540805105@qq.com")
    public RespModel<ProShopEntity> save(@RequestBody ProShopEntity entity) {
        log.info("entity={}", entity);
        if (proShopService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新店铺信息|王二廷|540805105@qq.com")
    public RespModel<ProShopEntity> update(@RequestBody ProShopEntity entity) {
        log.info("entity={}", entity);
        if (proShopService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取店铺列表|王二廷|540805105@qq.com")
    public RespModel<Page<ProShopEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<ProShopEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<ProShopEntity> wrapper = new LambdaQueryWrapper<ProShopEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(ProShopEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(ProShopEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<ProShopEntity> entityIPage = proShopService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
