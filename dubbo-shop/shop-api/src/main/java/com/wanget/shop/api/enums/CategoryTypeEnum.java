package com.wanget.shop.api.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Erting.Wang
 * @desciption 类型：1：一级，2：二级，3：子级
 * 类型：FIRST_1：一级，SECOND_2：二级，CHILD_3：子级
 * @date 2021/7/13 9:26 上午
 */
public enum CategoryTypeEnum implements Serializable {
    /**
     * 一级
     */
    FIRST_1(1, "一级"),
    /**
     * 二级
     */
    SECOND_2(2, "二级"),
    /**
     * 子级
     */
    CHILD_3(3, "二级"),
    ;

    @EnumValue
    private int code;
    private String message;

    private CategoryTypeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    CategoryTypeEnum() {
    }

    private static Map<Integer, CategoryTypeEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, CategoryTypeEnum> map = Maps.newHashMap();
        for (CategoryTypeEnum type : CategoryTypeEnum.values()) {
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
