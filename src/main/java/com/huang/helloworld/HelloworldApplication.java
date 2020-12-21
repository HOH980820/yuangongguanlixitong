package com.huang.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//本身就是spring的一个组件

//程序主入口

@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {
        //将springboot应用启动
        //springapplication类
        //run方法
        SpringApplication.run(HelloworldApplication.class, args);

    }

}
