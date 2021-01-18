package com.event.exception;

import com.event.common.AjaxResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * author:RaoB
 * date:2020/12/28 0028
 */
@RestControllerAdvice
public class ControllerException {

    //指定处理异常类型
    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public AjaxResult validArguments(MethodArgumentNotValidException e){
        return AjaxResult.error(99, e.getMessage());

    }
}
