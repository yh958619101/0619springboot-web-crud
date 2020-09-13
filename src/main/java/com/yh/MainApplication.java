package com.yh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 这是一个主配置类
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        //启动springboot项目，需要传入一个有@SpringBootApplication注解修饰的类对象
        SpringApplication.run(MainApplication.class, args);

    }
}
