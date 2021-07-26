package com.wanget.order.api.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Erting.Wang
 * @desciption 类说明
 * @date 2021/7/23 5:26 下午
 */
@Data
public class ProductDto implements Serializable {
    /**
     * 店铺id
     */
    private Integer shopId;
    /**
     * 产品id
     */
    private Integer productId;
    /**
     * 产品名称
     */
    private String productName;
    /**
     * 个数
     */
    private Integer quantity;
}
