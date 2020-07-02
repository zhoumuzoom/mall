package com.zhoumu.mall.demo.callback;

import lombok.Data;

/**
 * 回调实体
 * @author zhoumu
 * @date 2020/07/02
 */
@Data
public class CallbackBody<T> {
    private String code;
    private String msg;
    private T data;
}
