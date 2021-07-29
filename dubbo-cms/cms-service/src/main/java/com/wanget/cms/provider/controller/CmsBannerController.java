package com.wanget.cms.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.cms.api.entity.CmsBannerEntity;
import com.wanget.cms.api.service.CmsBannerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * banner(CmsBanner)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 14:02:11
 */
@RestController
@RequestMapping("/cmsBanner")
@Api(value = "cmsBanner", tags = "banner")
@Slf4j
public class CmsBannerController {
    /**
     * 服务对象
     */
    @Resource
    private CmsBannerService cmsBannerService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取banner详情|王二廷|540805105@qq.com")
    public RespModel<CmsBannerEntity> get(@PathVariable Long id) {
        CmsBannerEntity entity = cmsBannerService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除banner|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(cmsBannerService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加banner|王二廷|540805105@qq.com")
    public RespModel<CmsBannerEntity> save(@RequestBody CmsBannerEntity entity) {
        log.info("entity={}", entity);
        if (cmsBannerService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新banner信息|王二廷|540805105@qq.com")
    public RespModel<CmsBannerEntity> update(@RequestBody CmsBannerEntity entity) {
        log.info("entity={}", entity);
        if (cmsBannerService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取banner列表|王二廷|540805105@qq.com")
    public RespModel<Page<CmsBannerEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<CmsBannerEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<CmsBannerEntity> wrapper = new LambdaQueryWrapper<CmsBannerEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(CmsBannerEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(CmsBannerEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<CmsBannerEntity> entityIPage = cmsBannerService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
