package com.wanget.order.api.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Erting.Wang
 * @desciption 订单状态;0:未知,1:未支付,2:已支付,3:已取消,4:已完成
 * 订单状态;UNKNOWN_0:未知,UNPAID_1:未支付,PAID_2:已支付,CANCELLED_3:已取消,COMPLETED_4:已完成
 * @date 2021/7/13 9:26 上午
 */
public enum OrderStatusEnum implements Serializable {
    /**
     * 未知
     */
    UNKNOWN_0(0, "未知"),
    /**
     * 未支付
     */
    UNPAID_1(1, "未支付"),
    /**
     * 已支付
     */
    PAID_2(2, "已支付"),
    /**
     * 已取消
     */
    CANCELLED_3(3, "已取消"),
    /**
     * 已完成
     */
    COMPLETED_4(4, "已完成"),
    ;

    @EnumValue
    private int code;
    private String message;

    private OrderStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    OrderStatusEnum() {
    }

    private static Map<Integer, OrderStatusEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, OrderStatusEnum> map = Maps.newHashMap();
        for (OrderStatusEnum type : OrderStatusEnum.values()) {
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
