package com.wanget.cms.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wanget.cms.api.enums.CmsArticleStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章(CmsArticle)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:11:28
 */
@Data
@TableName("cms_article")
@ApiModel("文章信息")
public class CmsArticleEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    @ApiModelProperty("主键")
    private Integer id;
    /**
     * 类型
     */
    @TableField("`article_type_id`")
    @ApiModelProperty("类型")
    private Integer articleTypeId;
    /**
     * 标题
     */
    @TableField("`title`")
    @ApiModelProperty("标题")
    private String title;
    /**
     * 内容
     */
    @TableField("`content`")
    @ApiModelProperty("内容")
    private String content;
    /**
     * 图片
     */
    @TableField("`image`")
    @ApiModelProperty("图片")
    private String image;
    /**
     * 状态，0：禁用，1：启用
     */
    @TableField("`status`")
    @ApiModelProperty("状态，1：待审核，2：审核中，3：审核失败，4：发布")
    private CmsArticleStatusEnum status;
    /**
     * 是否推荐
     */
    @TableField("`recommend`")
    @ApiModelProperty("是否推荐")
    private Integer recommend;
    /**
     * 浏览次数
     */
    @TableField("`view_count`")
    @ApiModelProperty("浏览次数")
    private Integer viewCount;
    /**
     * 创建者
     */
    @TableField("`creater`")
    @ApiModelProperty("创建者")
    private Integer creater;
    /**
     * 创建时间
     */
    @TableField("`ctime`")
    @ApiModelProperty("创建时间")
    private Date ctime;
    /**
     * 更新时间
     */
    @TableField("`utime`")
    @ApiModelProperty("更新时间")
    private Date utime;
    /**
     * 审核员
     */
    @TableField("`auditor`")
    @ApiModelProperty("审核员")
    private Integer auditor;
    /**
     * 审核时间
     */
    @TableField("`atime`")
    @ApiModelProperty("审核时间")
    private Date atime;

}
