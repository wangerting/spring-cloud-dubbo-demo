package com.wanget.cms.provider.controller;

import com.wanget.cms.api.entity.CmsArticleEntity;
import com.wanget.cms.api.service.CmsArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Erting.Wang
 * @desciption 类说明
 * @date 2021/7/23 12:09 下午
 */
@RestController
@RequestMapping("/cmsArticle")
@Api(value = "cmsArticle", tags = "cms文章相关接口")
@Slf4j
public class CmsArticleController {
    @Resource
    CmsArticleService cmsArticleService;

    @GetMapping("/get/{id}")
    @ApiOperation(value = "获取文章详情|王二廷|540805105@qq.com")
    public CmsArticleEntity get(@PathVariable Long id) {
        CmsArticleEntity articleEntity = cmsArticleService.getById(id);
        log.info("articleEntity={}", articleEntity);
        return articleEntity;
    }
}
