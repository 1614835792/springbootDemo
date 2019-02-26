package com.imooc.demo.handler;

import com.imooc.demo.result.Result;
import com.imooc.demo.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AreaExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handler(Exception e){
        if(e instanceof RuntimeException){
            return ResultUtil.error(100,e.getMessage());
        }else{
            return ResultUtil.error(-1,"未知错误");
        }

    }

}
