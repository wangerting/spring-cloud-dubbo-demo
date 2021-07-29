package com.wanget.order.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.order.api.dto.OrderDto;
import com.wanget.order.api.entity.WebOrderEntity;
import com.wanget.order.api.service.WebOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 订单(WebOrder)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 13:58:21
 */
@RestController
@RequestMapping("/webOrder")
@Api(value = "webOrder", tags = "订单")
@Slf4j
public class WebOrderController {
    /**
     * 服务对象
     */
    @Resource
    private WebOrderService webOrderService;

    @PostMapping("/add")
    @ApiOperation(value = "创建订单|王二廷|540805105@qq.com")
    public boolean add(@RequestBody OrderDto order) {
        log.info("order={}", order);
        return webOrderService.createOrder(order);
    }

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取订单详情|王二廷|540805105@qq.com")
    public RespModel<WebOrderEntity> get(@PathVariable Long id) {
        WebOrderEntity entity = webOrderService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除订单|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(webOrderService.removeById(id));
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新订单信息|王二廷|540805105@qq.com")
    public RespModel<WebOrderEntity> update(@RequestBody WebOrderEntity entity) {
        log.info("entity={}", entity);
        if (webOrderService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取订单列表|王二廷|540805105@qq.com")
    public RespModel<Page<WebOrderEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<WebOrderEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<WebOrderEntity> wrapper = new LambdaQueryWrapper<WebOrderEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(WebOrderEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(WebOrderEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<WebOrderEntity> entityIPage = webOrderService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
