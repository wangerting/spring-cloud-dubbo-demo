package com.wanget.shop.api.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Erting.Wang
 * @desciption 状态，0：禁用，1：启用
 * 状态;状态，DISABLE_0：禁用，ENABLE_1：启用
 * @date 2021/7/13 9:26 上午
 */
public enum ShopStatusEnum implements Serializable {
    /**
     * 禁用
     */
    DISABLE_0(0, "禁用"),
    /**
     * 启用
     */
    ENABLE_1(1, "启用"),
    ;

    @EnumValue
    private int code;
    private String message;

    private ShopStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    ShopStatusEnum() {
    }

    private static Map<Integer, ShopStatusEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, ShopStatusEnum> map = Maps.newHashMap();
        for (ShopStatusEnum type : ShopStatusEnum.values()) {
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
