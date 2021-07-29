package com.wanget.model.resp;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Erting.Wang
 * @desciption 接口返回参数
 * @date 2021/7/29 10:35 上午
 */
@Data
public class RespModel<T> implements Serializable {
    private static final String SUCCESS_CODE = "200";
    private static final String FAIL_CODE = "201";
    private String code;
    private String msg;
    private T data;

    public RespModel(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public RespModel(String code, String msg) {
        this(code, msg, null);
    }

    public RespModel() {
    }


    public static <T> RespModel<T> OK(T data) {
        return new RespModel<>(SUCCESS_CODE, "操作成功", data);
    }

    public static <T> RespModel<T> ERROR(T data) {
        return new RespModel<>(FAIL_CODE, "操作失败", data);
    }
}
