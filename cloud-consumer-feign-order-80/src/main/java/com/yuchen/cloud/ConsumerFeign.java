package com.yuchen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yuchen
 * 2020/3/23/023 22:55
 **/
@SpringBootApplication
@EnableFeignClients
public class ConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign.class,args);
    }
}
