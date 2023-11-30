package com.atguigu.spzx.service;

import com.atguigu.spzx.model.dto.system.LoginDto;
import com.atguigu.spzx.model.entity.system.SysUser;
import com.atguigu.spzx.model.vo.system.LoginVo;

/**
 * ClassName:SysUserService
 * Package:com.atguigu.spzx.service
 * Description:
 *
 * @Author:小飞机
 * @Create：2023/11/24 - 21:33
 * @Version: v1.0
 */
public interface SysUserService {
    /**
     * 根据用户名查询用户数据
     * @return
     */
    public abstract LoginVo login(LoginDto loginDto) ;

    SysUser getUserInfo(String token);
}
