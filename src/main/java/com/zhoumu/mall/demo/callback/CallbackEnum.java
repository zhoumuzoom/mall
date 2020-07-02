package com.zhoumu.mall.demo.callback;

/**
 * 回调信息枚举
 * @author zhoumu
 * @date 2020/07/02
 */
public enum CallbackEnum {
    // 请求成功
    SUCCESS("00000", "操作成功"),
    // 业务异常
    FAIL("50000", "业务异常");

    private final String code;

    private final String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    CallbackEnum (String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}