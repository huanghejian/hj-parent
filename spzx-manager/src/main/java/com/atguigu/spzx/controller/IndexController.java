package com.atguigu.spzx.controller;

import com.atguigu.spzx.model.dto.system.LoginDto;
import com.atguigu.spzx.model.entity.system.SysUser;
import com.atguigu.spzx.model.vo.common.Result;
import com.atguigu.spzx.model.vo.common.ResultCodeEnum;
import com.atguigu.spzx.model.vo.system.LoginVo;
import com.atguigu.spzx.model.vo.system.ValidateCodeVo;
import com.atguigu.spzx.service.SysUserService;
import com.atguigu.spzx.service.ValidateCodeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName:IndexController
 * Package:com.atguigu.spzx.controller
 * Description:
 *
 * @Author:小飞机
 * @Create：2023/11/24 - 21:32
 * @Version: v1.0
 */
    @Tag(name = "用户接口")
    @RestController
    @RequestMapping(value = "/admin/system/index")
    public class IndexController {

        @Autowired
        private SysUserService sysUserService ;



    @Autowired
    private ValidateCodeService validateCodeService;

    @GetMapping(value = "/generateValidateCode")
    public Result<ValidateCodeVo> generateValidateCode() {
        ValidateCodeVo validateCodeVo = validateCodeService.generateValidateCode();
        return Result.build(validateCodeVo , ResultCodeEnum.SUCCESS) ;
    }

        @Operation(summary = "登录接口")
        @PostMapping(value = "/login")
        public Result<LoginVo> login(@RequestBody LoginDto loginDto) {
            LoginVo loginVo = sysUserService.login(loginDto) ;
            return Result.build(loginVo , ResultCodeEnum.SUCCESS) ;
        }
    @GetMapping(value = "/getUserInfo")
    public Result<SysUser> getUserInfo(@RequestHeader(name = "token") String token){
        SysUser sysUser = sysUserService.getUserInfo(token) ;
        return Result.build(sysUser , ResultCodeEnum.SUCCESS) ;
    }
}
