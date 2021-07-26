package com.wanget.shop.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wanget.shop.api.enums.ProductStatusEnum;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * (ProProduct)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 11:18:48
 */
@Data
@TableName("pro_product")
public class ProProductEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;
    /**品牌*/
    @TableField("`brand_id`")
    private Integer brandId;
    /**分类*/
    @TableField("`category_id`")
    private Integer categoryId;
    /**店铺*/
    @TableField("`shop_id`")
    private Integer shopId;
    /**名称*/
    @TableField("`name`")
    private String name;
    /**图片*/
    @TableField("`image`")
    private String image;
    /**价格*/
    @TableField("`price`")
    private BigDecimal price;
    /**进价*/
    @TableField("`purchase_price`")
    private BigDecimal purchasePrice;
    /**足销价*/
    @TableField("`sale_price`")
    private BigDecimal salePrice;
    /**库存*/
    @TableField("`stock`")
    private Integer stock;
    /**状态：0：下架，1：上架*/
    @TableField("`status`")
    private ProductStatusEnum status;
    /**编号*/
    @TableField("`number`")
    private String number;

    @TableField("`ctime`")
    private Date ctime;

    @TableField("`utime`")
    private Date utime;

}
