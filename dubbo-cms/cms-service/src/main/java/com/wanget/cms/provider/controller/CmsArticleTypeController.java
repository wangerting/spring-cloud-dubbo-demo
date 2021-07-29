package com.wanget.cms.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.cms.api.entity.CmsArticleTypeEntity;
import com.wanget.cms.api.service.CmsArticleTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 文章类型(CmsArticleType)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 14:02:11
 */
@RestController
@RequestMapping("/cmsArticleType")
@Api(value = "cmsArticleType", tags = "文章类型")
@Slf4j
public class CmsArticleTypeController {
    /**
     * 服务对象
     */
    @Resource
    private CmsArticleTypeService cmsArticleTypeService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取文章类型详情|王二廷|540805105@qq.com")
    public RespModel<CmsArticleTypeEntity> get(@PathVariable Long id) {
        CmsArticleTypeEntity entity = cmsArticleTypeService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除文章类型|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(cmsArticleTypeService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加文章类型|王二廷|540805105@qq.com")
    public RespModel<CmsArticleTypeEntity> save(@RequestBody CmsArticleTypeEntity entity) {
        log.info("entity={}", entity);
        if (cmsArticleTypeService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新文章类型信息|王二廷|540805105@qq.com")
    public RespModel<CmsArticleTypeEntity> update(@RequestBody CmsArticleTypeEntity entity) {
        log.info("entity={}", entity);
        if (cmsArticleTypeService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取文章类型列表|王二廷|540805105@qq.com")
    public RespModel<Page<CmsArticleTypeEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<CmsArticleTypeEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<CmsArticleTypeEntity> wrapper = new LambdaQueryWrapper<CmsArticleTypeEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(CmsArticleTypeEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(CmsArticleTypeEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<CmsArticleTypeEntity> entityIPage = cmsArticleTypeService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
