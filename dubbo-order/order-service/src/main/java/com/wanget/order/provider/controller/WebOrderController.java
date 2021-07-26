package com.wanget.order.provider.controller;

import com.wanget.order.api.dto.OrderDto;
import com.wanget.order.api.entity.WebOrderEntity;
import com.wanget.order.api.service.WebOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Erting.Wang
 * @desciption 类说明
 * @date 2021/7/23 1:56 下午
 */
@RestController
@RequestMapping("/webOrder")
@Api(value = "webOrder", tags = "订单相关接口")
@Slf4j

public class WebOrderController {

    @Resource
    WebOrderService webOrderService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取订单详情|王二廷|540805105@qq.com")
    public WebOrderEntity get(@PathVariable Long id) {
        WebOrderEntity orderEntity = webOrderService.getById(id);
        log.info("orderEntity={}", orderEntity);
        return orderEntity;
    }

    @PostMapping("/add")
    @ApiOperation(value = "创建订单|王二廷|540805105@qq.com")
    public boolean add(@RequestBody OrderDto order) {
        log.info("order={}", order);
        return webOrderService.createOrder(order);
    }
}
