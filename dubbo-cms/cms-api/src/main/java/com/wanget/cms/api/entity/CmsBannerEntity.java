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
 * banner(CmsBanner)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:11:31
 */
@Data
@TableName("cms_banner")
public class CmsBannerEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;

    /**
     * 状态，0：禁用，1：启用
     */
    @TableField("`status`")
    private CommonStatusEnum status;

    @TableField("`title`")
    private String title;
    /**位置*/
    @TableField("`index`")
    private Object index;

    @TableField("`url`")
    private String url;

    @TableField("`content`")
    private String content;

    @TableField("`image`")
    private String image;

    @TableField("`creater`")
    private Integer creater;

    @TableField("`updater`")
    private Integer updater;

    @TableField("`ctime`")
    private Date ctime;

    @TableField("`utime`")
    private Date utime;

}
