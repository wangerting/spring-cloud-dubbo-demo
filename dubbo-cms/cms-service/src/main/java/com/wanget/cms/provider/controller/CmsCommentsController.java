package com.wanget.cms.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.cms.api.entity.CmsCommentsEntity;
import com.wanget.cms.api.service.CmsCommentsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 评论(CmsComments)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 14:02:11
 */
@RestController
@RequestMapping("/cmsComments")
@Api(value = "cmsComments", tags = "评论")
@Slf4j
public class CmsCommentsController {
    /**
     * 服务对象
     */
    @Resource
    private CmsCommentsService cmsCommentsService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取评论详情|王二廷|540805105@qq.com")
    public RespModel<CmsCommentsEntity> get(@PathVariable Long id) {
        CmsCommentsEntity entity = cmsCommentsService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除评论|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(cmsCommentsService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加评论|王二廷|540805105@qq.com")
    public RespModel<CmsCommentsEntity> save(@RequestBody CmsCommentsEntity entity) {
        log.info("entity={}", entity);
        if (cmsCommentsService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新评论信息|王二廷|540805105@qq.com")
    public RespModel<CmsCommentsEntity> update(@RequestBody CmsCommentsEntity entity) {
        log.info("entity={}", entity);
        if (cmsCommentsService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取评论列表|王二廷|540805105@qq.com")
    public RespModel<Page<CmsCommentsEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<CmsCommentsEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<CmsCommentsEntity> wrapper = new LambdaQueryWrapper<CmsCommentsEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(CmsCommentsEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(CmsCommentsEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<CmsCommentsEntity> entityIPage = cmsCommentsService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
