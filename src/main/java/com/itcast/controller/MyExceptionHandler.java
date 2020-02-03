package com.itcast.controller;

import com.itcast.entry.ResultModel;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @作者 itcast
 * @创建日期 2020/2/3 10:19
 **/
@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResultModel error1(Exception e){
        return new ResultModel("500",e.getMessage(),null);
    }
}
