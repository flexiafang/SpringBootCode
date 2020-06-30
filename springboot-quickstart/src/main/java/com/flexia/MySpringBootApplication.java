package com.flexia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 引导类：springboot应用的入口
 *
 * @Author hustffx
 * @Date 2020/6/29 21:11
 */
// @EnableAutoConfiguration // 启动springboot应用的自动配置
// @ComponentScan // 扫描该类所在的包及其所有子包
@SpringBootApplication // 使用组合注解，相当于EnableAutoConfiguration、ComponentScan、SpringBootConfiguration的总和
public class MySpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApplication.class, args);
    }
}
