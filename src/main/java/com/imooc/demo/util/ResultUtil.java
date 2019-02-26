package com.imooc.demo.util;

import com.imooc.demo.result.Result;

public class ResultUtil {
    public static Result sucess(Object object){
        return new Result(1,"成功",object);
    }
    public static Result error(){
        return new Result(0,"失败",null);
    }
    public static Result error(Integer code,String Message){
        return new Result(code,Message, null);
    }
    public static Result sucess(){
        return  sucess(null);
    }
}
