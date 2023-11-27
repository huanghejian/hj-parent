package com.atguigu.spzx.common.exception;

import com.atguigu.spzx.model.vo.common.ResultCodeEnum;
import lombok.Data;

/**
 * ClassName:HjException
 * Package:com.atguigu.spzx.common.config
 * Description:
 *
 * @Author:小飞机
 * @Create：2023/11/25 - 16:08
 * @Version: v1.0
 */
@Data
public class HjException extends RuntimeException{
    private Integer code;
    private String message;
    private ResultCodeEnum resultCodeEnum;

    public HjException(ResultCodeEnum resultCodeEnum){
        this.code = resultCodeEnum.getCode();
        this.message = resultCodeEnum.getMessage();
        this.resultCodeEnum = resultCodeEnum;
    }

}
