package com.wanget.user.api.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Erting.Wang
 * @desciption 等级，1：初级,2:vip,3:vvip
 * 等级，ELEMENTARY_1：初级,VIP_2:vip,V_VIP_3:vvip
 * @date 2021/7/13 9:26 上午
 */
public enum WebUserLevelEnum implements Serializable {
    /**
     * 初级
     */
    ELEMENTARY_1(1, "初级"),
    /**
     * vip
     */
    VIP_2(2, "vip"),
    /**
     * vvip
     */
    V_VIP_3(3, "vvip"),
    ;

    @EnumValue
    private int code;
    private String message;

    private WebUserLevelEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    WebUserLevelEnum() {
    }

    private static Map<Integer, WebUserLevelEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, WebUserLevelEnum> map = Maps.newHashMap();
        for (WebUserLevelEnum type : WebUserLevelEnum.values()) {
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
