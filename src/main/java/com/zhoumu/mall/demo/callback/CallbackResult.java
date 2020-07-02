package com.zhoumu.mall.demo.callback;

/**
 * 回调结果
 * @author zhoumu
 * @date 2020/07/02
 */
public class CallbackResult {
    private static final String SUCCESS_CODE = CallbackEnum.SUCCESS.getCode();
    private static final String SUCCESS_MSG = CallbackEnum.SUCCESS.getMsg();
    private static final String FAIL_CODE = CallbackEnum.FAIL.getCode();
    private static final String FAIL_MSG = CallbackEnum.FAIL.getMsg();

    public static <T> CallbackBody<T> success () {
        return success(null);
    }

    public static <T> CallbackBody<T> success (T data) {
        CallbackBody<T> callbackBody = new CallbackBody<>();
        callbackBody.setCode(SUCCESS_CODE);
        callbackBody.setMsg(SUCCESS_MSG);
        callbackBody.setData(data);
        return callbackBody;
    }

    public static <T> CallbackBody<T> fail () {
        return fail(null);
    }

    public static <T> CallbackBody<T> fail (T data) {
        CallbackBody<T> callbackBody = new CallbackBody<>();
        callbackBody.setCode(FAIL_CODE);
        callbackBody.setMsg(FAIL_MSG);
        callbackBody.setData(data);
        return callbackBody;
    }
}
