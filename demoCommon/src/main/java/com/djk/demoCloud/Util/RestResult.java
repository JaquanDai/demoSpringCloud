package com.djk.demoCloud.Util;

import lombok.Data;

@Data
public class RestResult<T> {

    private static final long serialVersionUID = 1L;

    /**
     * 成功
     */
    public static final int SUCCESS = 200;

    /**
     * 失败
     */
    public static final int FAIL = 500;

    private int code;

    private String msg;

    private T data;

    public static <T> RestResult<T> ok() {
        return restResult(null, SUCCESS, null);
    }

    public static <T> RestResult<T> ok(T data) {
        return restResult(data, SUCCESS, null);
    }

    public static <T> RestResult<T> ok(T data, String msg) {
        return restResult(data, SUCCESS, msg);
    }

    public static <T> RestResult<T> fail() {
        return restResult(null, FAIL, null);
    }

    public static <T> RestResult<T> fail(String msg) {
        return restResult(null, FAIL, msg);
    }

    public static <T> RestResult<T> fail(T data) {
        return restResult(data, FAIL, null);
    }

    public static <T> RestResult<T> fail(T data, String msg) {
        return restResult(data, FAIL, msg);
    }

    public static <T> RestResult<T> fail(int code, String msg) {
        return restResult(null, code, msg);
    }

    private static <T> RestResult<T> restResult(T data, int code, String msg) {
        RestResult<T> apiResult = new RestResult<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }


}
