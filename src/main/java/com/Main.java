package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zw
 * @date 2020/4/22 18:48
 */
@EnableAutoConfiguration
@MapperScan("com.sihai.mapper")
@SpringBootApplication
public class Main  {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        System.out.println("------    teacher-interaction-face启动成功   ------\n");
    }
}
