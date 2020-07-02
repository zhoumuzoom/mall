package com.zhoumu.mall.demo.exception;

/**
 * 自定义异常
 * @author zhoumu
 * @date 2020/06/24
 */
public class SystemException extends RuntimeException {
    private static final long serialVersionUID = 785946140996479915L;

    private String code;
    private String msg;

    public SystemException() {
    }

    public SystemException (String msg) {
        this.msg = msg;
    }

    public SystemException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
