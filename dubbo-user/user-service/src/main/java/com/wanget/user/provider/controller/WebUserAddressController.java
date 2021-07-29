package com.wanget.user.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.user.api.entity.WebUserAddressEntity;
import com.wanget.user.api.service.WebUserAddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 用户收货地址(WebUserAddress)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 13:37:35
 */
@RestController
@RequestMapping("/webUserAddress")
@Api(value = "webUserAddress", tags = "用户收货地址")
@Slf4j
public class WebUserAddressController {
    /**
     * 服务对象
     */
    @Resource
    private WebUserAddressService webUserAddressService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取用户收货地址详情|王二廷|540805105@qq.com")
    public RespModel<WebUserAddressEntity> get(@PathVariable Long id) {
        WebUserAddressEntity entity = webUserAddressService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除用户收货地址|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(webUserAddressService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加用户收货地址|王二廷|540805105@qq.com")
    public RespModel<WebUserAddressEntity> save(@RequestBody WebUserAddressEntity entity) {
        log.info("entity={}", entity);
        if (webUserAddressService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新用户收货地址信息|王二廷|540805105@qq.com")
    public RespModel<WebUserAddressEntity> update(@RequestBody WebUserAddressEntity entity) {
        log.info("entity={}", entity);
        if (webUserAddressService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取用户收货地址列表|王二廷|540805105@qq.com")
    public RespModel<Page<WebUserAddressEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<WebUserAddressEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<WebUserAddressEntity> wrapper = new LambdaQueryWrapper<WebUserAddressEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(WebUserAddressEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(WebUserAddressEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<WebUserAddressEntity> entityIPage = webUserAddressService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
