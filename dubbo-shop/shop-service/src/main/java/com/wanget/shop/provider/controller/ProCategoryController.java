package com.wanget.shop.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.shop.api.entity.ProCategoryEntity;
import com.wanget.shop.api.service.ProCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 产品分类(ProCategory)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 13:55:06
 */
@RestController
@RequestMapping("/proCategory")
@Api(value = "proCategory", tags = "产品分类")
@Slf4j
public class ProCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private ProCategoryService proCategoryService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取产品分类详情|王二廷|540805105@qq.com")
    public RespModel<ProCategoryEntity> get(@PathVariable Long id) {
        ProCategoryEntity entity = proCategoryService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除产品分类|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(proCategoryService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加产品分类|王二廷|540805105@qq.com")
    public RespModel<ProCategoryEntity> save(@RequestBody ProCategoryEntity entity) {
        log.info("entity={}", entity);
        if (proCategoryService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新产品分类信息|王二廷|540805105@qq.com")
    public RespModel<ProCategoryEntity> update(@RequestBody ProCategoryEntity entity) {
        log.info("entity={}", entity);
        if (proCategoryService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取产品分类列表|王二廷|540805105@qq.com")
    public RespModel<Page<ProCategoryEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<ProCategoryEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<ProCategoryEntity> wrapper = new LambdaQueryWrapper<ProCategoryEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(ProCategoryEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(ProCategoryEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<ProCategoryEntity> entityIPage = proCategoryService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
