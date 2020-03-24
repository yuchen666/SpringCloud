package com.yuchen.irule.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuchen
 * 2020/3/23/023 21:10
 **/
@Configuration
public class MyselRule {
    @Bean
    public IRule getRestTemplate(){
        return new RandomRule();
    }
}
