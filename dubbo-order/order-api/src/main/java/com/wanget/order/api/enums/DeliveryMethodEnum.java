package com.wanget.order.api.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Erting.Wang
 * @desciption 配送方式：0:未知, 1：送货上门，2：自取
 * 配送方式：UNKNOWN_0:未知, PICKUP_1：送货上门，DELIVERY_2：自取
 * @date 2021/7/13 9:26 上午
 */
public enum DeliveryMethodEnum implements Serializable {
    /**
     * 未知
     */
    UNKNOWN_0(0, "未知"),
    /**
     * 送货上门
     */
    PICKUP_1(1, "送货上门"),
    /**
     * 自取
     */
    DELIVERY_2(2, "自取"),
    ;

    @EnumValue
    private int code;
    private String message;

    private DeliveryMethodEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    DeliveryMethodEnum() {
    }

    private static Map<Integer, DeliveryMethodEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, DeliveryMethodEnum> map = Maps.newHashMap();
        for (DeliveryMethodEnum type : DeliveryMethodEnum.values()) {
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
