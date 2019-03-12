package com.zhoubi.graindepot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan(value = "com.zhoubi.graindepot.mapper")
public class ReportApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ReportApplication.class, args);
    }

}
