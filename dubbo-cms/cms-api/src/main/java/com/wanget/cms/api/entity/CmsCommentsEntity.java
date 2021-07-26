package com.wanget.cms.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论(CmsComments)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:11:31
 */
@Data
@TableName("cms_comments")
public class CmsCommentsEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;

    @TableField("`pid`")
    private Integer pid;

    @TableField("`user_id`")
    private Integer userId;

    @TableField("`username`")
    private String username;

    @TableField("`article_id`")
    private Integer articleId;

    @TableField("`content`")
    private String content;

    @TableField("`ctime`")
    private Date ctime;

    @TableField("`utime`")
    private Date utime;

}
