package com.wanget.cms.api.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Erting.Wang
 * @desciption 状态，1：待审核，2：审核中，3：审核失败，4：发布
 * 状态，pending_1：待审核，under_2：审核中，failure_3：审核失败，release_4：发布
 * @date 2021/7/13 9:26 上午
 */
public enum CmsArticleStatusEnum implements Serializable {
    /**
     * 待审核
     */
    PENDING_1(1, "待审核"),
    /**
     * 审核中
     */
    UNDER_2(2, "审核中"),
    /**
     * 审核失败
     */
    FAILURE_3(3, "审核失败"),
    /**
     * 发布
     */
    RELEASE_4(4, "发布"),
    ;

    @EnumValue
    private int code;
    private String message;

    private CmsArticleStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    CmsArticleStatusEnum() {
    }

    private static Map<Integer, CmsArticleStatusEnum> MAP;
    public static Map<Integer, String> NAME_MAP = Maps.newHashMap();

    static {
        Map<Integer, CmsArticleStatusEnum> map = Maps.newHashMap();
        for (CmsArticleStatusEnum type : CmsArticleStatusEnum.values()) {
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
