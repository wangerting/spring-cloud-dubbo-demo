package com.wanget.order.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.order.api.entity.WebOrderProductEntity;
import com.wanget.order.api.service.WebOrderProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 订单与产品关联表(WebOrderProduct)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 13:58:23
 */
@RestController
@RequestMapping("/webOrderProduct")
@Api(value = "webOrderProduct", tags = "订单与产品关联表")
@Slf4j
public class WebOrderProductController {
    /**
     * 服务对象
     */
    @Resource
    private WebOrderProductService webOrderProductService;


    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取订单与产品关联表详情|王二廷|540805105@qq.com")
    public RespModel<WebOrderProductEntity> get(@PathVariable Long id) {
        WebOrderProductEntity entity = webOrderProductService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除订单与产品关联表|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(webOrderProductService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加订单与产品关联表|王二廷|540805105@qq.com")
    public RespModel<WebOrderProductEntity> save(@RequestBody WebOrderProductEntity entity) {
        log.info("entity={}", entity);
        if (webOrderProductService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新订单与产品关联表信息|王二廷|540805105@qq.com")
    public RespModel<WebOrderProductEntity> update(@RequestBody WebOrderProductEntity entity) {
        log.info("entity={}", entity);
        if (webOrderProductService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取订单与产品关联表列表|王二廷|540805105@qq.com")
    public RespModel<Page<WebOrderProductEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<WebOrderProductEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<WebOrderProductEntity> wrapper = new LambdaQueryWrapper<WebOrderProductEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(WebOrderProductEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(WebOrderProductEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<WebOrderProductEntity> entityIPage = webOrderProductService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
