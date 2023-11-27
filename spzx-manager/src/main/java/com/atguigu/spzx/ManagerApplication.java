package com.atguigu.spzx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ClassName:ManagerApplication
 * Package:com.atguigu.spzx
 * Description:
 *
 * @Author:小飞机
 * @Create：2023/11/24 - 21:29
 * @Version: v1.0
 */
@SpringBootApplication()
@ComponentScan(basePackages = {"com.atguigu"})

public class ManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class , args) ;
    }
}
