package com.company;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.company.userdao") // 1、在主启动文件配置；2、在mapper的接口类中使用注解 @Mapper

@SpringBootApplication
public class Ordermanage1Application {

    public static void main(String[] args) {
        SpringApplication.run(Ordermanage1Application.class, args);
    }

}
