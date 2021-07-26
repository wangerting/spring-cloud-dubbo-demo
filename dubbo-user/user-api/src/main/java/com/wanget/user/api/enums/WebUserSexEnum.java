package com.wanget.user.api.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Erting.Wang
 * @desciption 性别：1：男，2：女
 * 性别：BOY_1：男，GIRL_2：女
 * @date 2021/7/13 9:26 上午
 */
public enum WebUserSexEnum implements Serializable {
    /**
     * 男
     */
    BOY_1(1, "男"),
    /**
     * 女
     */
    GIRL_2(2, "女"),
    ;

    @EnumValue
    private int code;
    private String message;

    private WebUserSexEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    WebUserSexEnum() {
    }

    private static Map<Integer, WebUserSexEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, WebUserSexEnum> map = Maps.newHashMap();
        for (WebUserSexEnum type : WebUserSexEnum.values()) {
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
