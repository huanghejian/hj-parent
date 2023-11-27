package com.atguigu.spzx.service;

import com.atguigu.spzx.model.vo.system.ValidateCodeVo;

/**
 * ClassName:ValidateCodeService
 * Package:com.atguigu.spzx.service
 * Description:
 *
 * @Author:小飞机
 * @Create：2023/11/25 - 17:01
 * @Version: v1.0
 */
public interface ValidateCodeService {
    ValidateCodeVo generateValidateCode();
}
