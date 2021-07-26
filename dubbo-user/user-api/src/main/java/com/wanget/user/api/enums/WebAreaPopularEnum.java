package com.wanget.user.api.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Erting.Wang
 * @desciption 热门城市，1：是，2：否
 * 热门城市，TRUE_1：是，FALSE_2：否
 * @date 2021/7/13 9:26 上午
 */
public enum WebAreaPopularEnum implements Serializable {
    /**
     * 是
     */
    TRUE_1(1, "是"),
    /**
     * 否
     */
    FALSE_2(2, "否"),
    ;

    @EnumValue
    private int code;
    private String message;

    private WebAreaPopularEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    WebAreaPopularEnum() {
    }

    private static Map<Integer, WebAreaPopularEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, WebAreaPopularEnum> map = Maps.newHashMap();
        for (WebAreaPopularEnum type : WebAreaPopularEnum.values()) {
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
