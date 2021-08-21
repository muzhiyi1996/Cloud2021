package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class HystrixOrerMain80 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixOrerMain80.class,args);
        System.out.println("**********************************************************************");
        System.out.println("*********HystrixOrerMain80  start successful**************************");
        System.out.println("**********************************************************************");
    }
}
