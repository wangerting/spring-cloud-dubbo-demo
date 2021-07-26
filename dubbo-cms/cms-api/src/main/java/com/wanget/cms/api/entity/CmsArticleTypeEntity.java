package com.wanget.cms.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wanget.model.enums.CommonStatusEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章类型(CmsArticleType)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:11:31
 */
@Data
@TableName("cms_article_type")
public class CmsArticleTypeEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;

    @TableField("`name`")
    private String name;

    /**
     * 状态，0：禁用，1：启用
     */
    @TableField("`status`")
    private CommonStatusEnum status;

    @TableField("`creater`")
    private Integer creater;

    @TableField("`updater`")
    private Integer updater;

    @TableField("`ctime`")
    private Date ctime;

    @TableField("`utime`")
    private Date utime;

}
