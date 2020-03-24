package com.yuchen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yuchen
 * 2020/3/23/023 20:14
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulMain80.class,args);
    }
}
