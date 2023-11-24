package com.atguigu.spzx.mapper;

import com.atguigu.spzx.model.entity.system.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:SysUserMapper
 * Package:com.atguigu.spzx.mapper
 * Description:
 *
 * @Author:小飞机
 * @Create：2023/11/24 - 21:36
 * @Version: v1.0
 */
@Mapper
public interface SysUserMapper {
    /**
     * 根据用户名查询用户数据
     * @param userName
     * @return
     */
    public abstract SysUser selectByUserName(String userName) ;
}
