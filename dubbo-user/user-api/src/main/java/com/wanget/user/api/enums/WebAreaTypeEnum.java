package com.wanget.user.api.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Erting.Wang
 * @desciption 地区类型，1:国家，2:省份，3：城市，4：区
 * 地区类型，COUNTRY_1:国家，PROVINCE_2:省份，CITY_3：城市，AREA_4：区
 * @date 2021/7/13 9:26 上午
 */
public enum WebAreaTypeEnum implements Serializable {
    /**
     * 国家
     */
    COUNTRY_1(1, "国家"),
    /**
     * vip
     */
    PROVINCE_2(2, "省份"),
    /**
     * 城市
     */
    CITY_3(3, "城市"),
    /**
     * 区
     */
    AREA_4(4, "区"),
    ;

    @EnumValue
    private int code;
    private String message;

    private WebAreaTypeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    WebAreaTypeEnum() {
    }

    private static Map<Integer, WebAreaTypeEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, WebAreaTypeEnum> map = Maps.newHashMap();
        for (WebAreaTypeEnum type : WebAreaTypeEnum.values()) {
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
