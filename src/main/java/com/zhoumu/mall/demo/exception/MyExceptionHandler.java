package com.zhoumu.mall.demo.exception;

import com.zhoumu.mall.demo.callback.CallbackBody;
import com.zhoumu.mall.demo.callback.CallbackResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 * @author zhoumu
 * @date 2020/07/02
 */
@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(SystemException.class)
    public CallbackBody<?> exceptionHandler(SystemException systemException) {
        return CallbackResult.fail(systemException.getMsg());
    }
}
