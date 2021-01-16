package com.liang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*@tk.mybatis.spring.annotation.MapperScan("com.baizhi.liang.dao")
@org.mybatis.spring.annotation.MapperScan("com.baizhi.liang.dao")*/
@SpringBootApplication
public class FunctionApplication {
    public static void main(String[] args) {
        SpringApplication.run(FunctionApplication.class,args);
    }
}
