package com.zgps.zapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zgps.zapp.mapper")
public class ZappApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZappApplication.class, args);
    }

}
