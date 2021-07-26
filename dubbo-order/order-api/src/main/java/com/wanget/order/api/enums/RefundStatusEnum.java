package com.wanget.order.api.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Erting.Wang
 * @desciption 退款状态;0:未知,1:申请退款,2:审核中,3:审核完成,4:驳回,5:退款中,6:退款完成
 * 退款状态;UNKNOWN_0:未知,REFUND_1:申请退款,REVIEW_2:审核中,REVIEWED_3:审核完成,OVERRULE_4:驳回,REFUNDING_5:退款中,REFUNDED_6:退款完成
 * @date 2021/7/13 9:26 上午
 */
public enum RefundStatusEnum implements Serializable {
    /**
     * 未知
     */
    UNKNOWN_0(0, "未知"),
    /**
     * 申请退款
     */
    REFUND_1(1, "申请退款"),
    /**
     * 审核中
     */
    REVIEW_2(2, "审核中"),
    /**
     * 审核完成
     */
    REVIEWED_3(3, "审核完成"),
    /**
     * 驳回
     */
    OVERRULE_4(4, "驳回"),
    REFUNDING_5(5, "退款中"),
    REFUNDED_6(6, "退款完成"),
    ;

    @EnumValue
    private int code;
    private String message;

    private RefundStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    RefundStatusEnum() {
    }

    private static Map<Integer, RefundStatusEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, RefundStatusEnum> map = Maps.newHashMap();
        for (RefundStatusEnum type : RefundStatusEnum.values()) {
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
