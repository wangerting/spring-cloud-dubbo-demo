package com.wanget.cms.provider.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wanget.model.query.BaseQuery;
import com.wanget.model.resp.RespModel;
import com.wanget.model.utils.DateUtils;
import com.wanget.cms.api.entity.CmsArticleEntity;
import com.wanget.cms.api.service.CmsArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 文章(CmsArticle)表控制层
 *
 * @author Erting.Wang
 * @since 2021-07-29 14:02:09
 */
@RestController
@RequestMapping("/cmsArticle")
@Api(value = "cmsArticle", tags = "文章")
@Slf4j
public class CmsArticleController {
    /**
     * 服务对象
     */
    @Resource
    private CmsArticleService cmsArticleService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取文章详情|王二廷|540805105@qq.com")
    public RespModel<CmsArticleEntity> get(@PathVariable Long id) {
        CmsArticleEntity entity = cmsArticleService.getById(id);
        log.info("entity={}", entity);
        return RespModel.OK(entity);
    }

    @GetMapping("/delete/{id}")
    @ApiOperation(value = "删除文章|王二廷|540805105@qq.com")
    public RespModel<Boolean> delete(@PathVariable Long id) {
        return RespModel.OK(cmsArticleService.removeById(id));
    }

    @PostMapping("/save")
    @ApiOperation(value = "添加文章|王二廷|540805105@qq.com")
    public RespModel<CmsArticleEntity> save(@RequestBody CmsArticleEntity entity) {
        log.info("entity={}", entity);
        if (cmsArticleService.save(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/update")
    @ApiOperation(value = "更新文章信息|王二廷|540805105@qq.com")
    public RespModel<CmsArticleEntity> update(@RequestBody CmsArticleEntity entity) {
        log.info("entity={}", entity);
        if (cmsArticleService.updateById(entity)) {
            return RespModel.OK(entity);
        }
        return RespModel.ERROR(null);
    }

    @PostMapping("/page")
    @ApiOperation(value = "获取文章列表|王二廷|540805105@qq.com")
    public RespModel<Page<CmsArticleEntity>> get(@RequestBody BaseQuery query) {
        log.info("query={}", query);
        Page<CmsArticleEntity> page = new Page<>(query.getPage(), query.getPageSize());
        LambdaQueryWrapper<CmsArticleEntity> wrapper = new LambdaQueryWrapper<CmsArticleEntity>();
        if (Objects.nonNull(query.getStartTime())) {
            wrapper.ge(CmsArticleEntity::getCtime, DateUtils.firstMoment(query.getStartTime()));
        }
        if (Objects.nonNull(query.getEndTime())) {
            wrapper.le(CmsArticleEntity::getCtime, DateUtils.firstMoment(query.getEndTime()));
        }
        Page<CmsArticleEntity> entityIPage = cmsArticleService.page(page, wrapper);
        return RespModel.OK(entityIPage);
    }

}
