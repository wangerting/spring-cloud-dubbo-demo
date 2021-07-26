package com.wanget.shop.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wanget.shop.api.enums.ShopStatusEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 店铺(ProShop)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 11:19:07
 */
@Data
@TableName("pro_shop")
public class ProShopEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;
    /**
     * 名称
     */
    @TableField("`name`")
    private String name;
    /**
     * logo
     */
    @TableField("`logo`")
    private String logo;
    /**
     * 状态：0：禁用，1：启用
     */
    @TableField("`status`")
    private ShopStatusEnum status;
    /**
     * 描述
     */
    @TableField("`desc`")
    private String desc;

    @TableField("`ctime`")
    private Date ctime;

    @TableField("`utime`")
    private Date utime;

}
