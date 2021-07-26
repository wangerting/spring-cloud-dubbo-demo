package com.wanget.order.api.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Erting.Wang
 * @desciption 派送状态:0:未知,1:出库中,2:已打包,3:已打包,4:派送完成
 * 派送状态:UNKNOWN_0:未知,OUT_OF_STOCK_1:出库中,PACKED_2:已打包,DELIVERING_3:已打包,COMPLETED_4:派送完成
 * @date 2021/7/13 9:26 上午
 */
public enum DeliveryStatusEnum implements Serializable {
    /**
     * 未知
     */
    UNKNOWN_0(0, "未知"),
    /**
     * 出库中
     */
    OUT_OF_STOCK_1(1, "出库中"),
    /**
     * 已打包
     */
    PACKED_2(2, "已打包"),
    /**
     * 派送中
     */
    DELIVERING_3(3, "派送中"),
    /**
     * 派送完成
     */
    COMPLETED_4(4, "派送完成"),
    ;

    @EnumValue
    private int code;
    private String message;

    private DeliveryStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    DeliveryStatusEnum() {
    }

    private static Map<Integer, DeliveryStatusEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, DeliveryStatusEnum> map = Maps.newHashMap();
        for (DeliveryStatusEnum type : DeliveryStatusEnum.values()) {
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
