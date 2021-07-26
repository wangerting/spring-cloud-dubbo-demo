package com.wanget.shop.api.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Erting.Wang
 * @desciption 状态：0：下架，1：上架
 * 状态;状态，OFF_SHELF_0：下架，ON_SHELF_1：上架
 * @date 2021/7/13 9:26 上午
 */
public enum ProductStatusEnum implements Serializable {
    /**
     * 下架
     */
    OFF_SHELF_0(0, "下架"),
    /**
     * 上架
     */
    ON_SHELF_1(1, "上架"),
    ;

    @EnumValue
    private int code;
    private String message;

    private ProductStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    ProductStatusEnum() {
    }

    private static Map<Integer, ProductStatusEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, ProductStatusEnum> map = Maps.newHashMap();
        for (ProductStatusEnum type : ProductStatusEnum.values()) {
            NAME_MAP.put(type.getCode(), type.getMessage());
            map.put(type.getCode(), type);
        }
        MAP = ImmutableMap.copyOf(map);
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }


    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
