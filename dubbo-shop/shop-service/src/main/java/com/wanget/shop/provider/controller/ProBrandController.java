package com.wanget.shop.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.shop.api.entity.ProBrandEntity;
import com.wanget.shop.api.service.ProBrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 品牌(ProBrand)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 13:52:02
 */
@RestController
@RequestMapping("/proBrand")
@Api(value = "proBrand", tags = "品牌")
@Slf4j
public class ProBrandController {
    /**
     * 服务对象
     */
    @Resource
    private ProBrandService proBrandService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取品牌详情|王二廷|540805105@qq.com")
    public RespModel<ProBrandEntity> get(@PathVariable Long id) {
        ProBrandEntity entity = proBrandService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除品牌|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(proBrandService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加品牌|王二廷|540805105@qq.com")
    public RespModel<ProBrandEntity> save(@RequestBody ProBrandEntity entity) {
        log.info("entity={}", entity);
        if (proBrandService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新品牌信息|王二廷|540805105@qq.com")
    public RespModel<ProBrandEntity> update(@RequestBody ProBrandEntity entity) {
        log.info("entity={}", entity);
        if (proBrandService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取品牌列表|王二廷|540805105@qq.com")
    public RespModel<Page<ProBrandEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<ProBrandEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<ProBrandEntity> wrapper = new LambdaQueryWrapper<ProBrandEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(ProBrandEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(ProBrandEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<ProBrandEntity> entityIPage = proBrandService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
