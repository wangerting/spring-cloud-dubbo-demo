package com.wanget.user.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.user.api.entity.WebPublicAreasEntity;
import com.wanget.user.api.service.WebPublicAreasService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 各国城市列表(WebPublicAreas)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 13:37:32
 */
@RestController
@RequestMapping("/webPublicAreas")
@Api(value = "webPublicAreas", tags = "各国城市列表")
@Slf4j
public class WebPublicAreasController {
    /**
     * 服务对象
     */
    @Resource
    private WebPublicAreasService webPublicAreasService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取城市详情|王二廷|540805105@qq.com")
    public RespModel<WebPublicAreasEntity> get(@PathVariable Long id) {
        WebPublicAreasEntity entity = webPublicAreasService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除城市|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(webPublicAreasService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加城市|王二廷|540805105@qq.com")
    public RespModel<WebPublicAreasEntity> save(@RequestBody WebPublicAreasEntity entity) {
        log.info("entity={}", entity);
        if (webPublicAreasService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新城市|王二廷|540805105@qq.com")
    public RespModel<WebPublicAreasEntity> update(@RequestBody WebPublicAreasEntity entity) {
        log.info("entity={}", entity);
        if (webPublicAreasService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取城市列表|王二廷|540805105@qq.com")
    public RespModel<Page<WebPublicAreasEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<WebPublicAreasEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<WebPublicAreasEntity> wrapper = new LambdaQueryWrapper<WebPublicAreasEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(WebPublicAreasEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(WebPublicAreasEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<WebPublicAreasEntity> entityIPage = webPublicAreasService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
