package com.atguigu.spzx.common.exception;

import com.atguigu.spzx.model.vo.common.Result;
import com.atguigu.spzx.model.vo.common.ResultCodeEnum;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:GlobalExceptionHandler
 * Package:com.atguigu.spzx.common.exception
 * Description:
 *
 * @Author:小飞机
 * @Create：2023/11/25 - 16:00
 * @Version: v1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(){
        return Result.build(null, ResultCodeEnum.LOGIN_ERROR);
    }
    @ExceptionHandler(HjException.class)
    @ResponseBody
    public Result error(HjException e){
        return Result.build(null, e.getResultCodeEnum());
    }


}
