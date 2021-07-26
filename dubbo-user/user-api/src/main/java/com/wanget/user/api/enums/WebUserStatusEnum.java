package com.wanget.user.api.enums;

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
public enum WebUserStatusEnum implements Serializable {
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

    private WebUserStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    WebUserStatusEnum() {
    }

    private static Map<Integer, WebUserStatusEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, WebUserStatusEnum> map = Maps.newHashMap();
        for (WebUserStatusEnum type : WebUserStatusEnum.values()) {
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
