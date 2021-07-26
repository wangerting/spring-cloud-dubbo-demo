package com.wanget.cms.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * (CmsArticleTag)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 15:11:31
 */
@Data
@TableName("cms_article_tag")
public class CmsArticleTagEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;

    @TableField("`article_id`")
    private Integer articleId;

    @TableField("`tag_id`")
    private Integer tagId;

}
