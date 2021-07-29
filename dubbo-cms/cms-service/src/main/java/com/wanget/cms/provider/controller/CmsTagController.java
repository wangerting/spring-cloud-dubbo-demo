package com.wanget.cms.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.cms.api.entity.CmsTagEntity;
import com.wanget.cms.api.service.CmsTagService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 关键词(CmsTag)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 14:02:11
 */
@RestController
@RequestMapping("/cmsTag")
@Api(value = "cmsTag", tags = "关键词")
@Slf4j
public class CmsTagController {
    /**
     * 服务对象
     */
    @Resource
    private CmsTagService cmsTagService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取关键词详情|王二廷|540805105@qq.com")
    public RespModel<CmsTagEntity> get(@PathVariable Long id) {
        CmsTagEntity entity = cmsTagService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除关键词|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(cmsTagService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加关键词|王二廷|540805105@qq.com")
    public RespModel<CmsTagEntity> save(@RequestBody CmsTagEntity entity) {
        log.info("entity={}", entity);
        if (cmsTagService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新关键词信息|王二廷|540805105@qq.com")
    public RespModel<CmsTagEntity> update(@RequestBody CmsTagEntity entity) {
        log.info("entity={}", entity);
        if (cmsTagService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取关键词列表|王二廷|540805105@qq.com")
    public RespModel<Page<CmsTagEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<CmsTagEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<CmsTagEntity> wrapper = new LambdaQueryWrapper<CmsTagEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(CmsTagEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(CmsTagEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<CmsTagEntity> entityIPage = cmsTagService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
