package com.wanget.shop.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wanget.shop.api.enums.CategoryTypeEnum;
import com.wanget.shop.api.enums.ShopStatusEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品分类(ProCategory)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 11:18:29
 */
@Data
@TableName("pro_category")
public class ProCategoryEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;
    /**类型：1：一级，2：二级，3：子级*/
    @TableField("`type`")
    private CategoryTypeEnum type;
    /**父id*/
    @TableField("`p_id`")
    private Integer pId;
    /**名称*/
    @TableField("`name`")
    private String name;
    /**状态：0：禁用，1：启用*/
    @TableField("`status`")
    private ShopStatusEnum status;

    @TableField("`ctime`")
    private Date ctime;

    @TableField("`utime`")
    private Date utime;

}
