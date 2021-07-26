package com.wanget.order.api.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Erting.Wang
 * @desciption 支付方式;0:未知,1:支付宝,2:微信
 * 支付方式;UNKNOWN_0:未知,ALIPAY_1:支付宝,WEIXIN_2:微信
 * @date 2021/7/13 9:26 上午
 */
public enum PayTypeEnum implements Serializable {
    /**
     * 未知
     */
    UNKNOWN_0(0, "未知"),
    /**
     * 支付宝
     */
    ALIPAY_1(1, "支付宝"),
    /**
     * 微信
     */
    WEIXIN_2(2, "微信"),
    ;

    @EnumValue
    private int code;
    private String message;

    private PayTypeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    PayTypeEnum() {
    }

    private static Map<Integer, PayTypeEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, PayTypeEnum> map = Maps.newHashMap();
        for (PayTypeEnum type : PayTypeEnum.values()) {
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
