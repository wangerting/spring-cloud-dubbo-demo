package com.wanget.order.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Erting.Wang
 * @desciption 类说明
 * @date 2021/7/23 5:22 下午
 */
@Data
public class OrderDto implements Serializable {
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 用户名称
     */
    private String username;
    /**
     * 产品信息
     */
    private List<ProductDto> products;
}
