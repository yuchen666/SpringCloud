package com.yuchen.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yuchen
 * 2020/3/23/023 20:14
 **/
@RestController
public class OrderConsul {

    private static final String INVUKE_URL="http://consul-provider-payment/";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "consumer/payment/consul")
    public String orderConsul(){
        String result = restTemplate.getForObject(INVUKE_URL+"/payment/consul",String.class);
        return result;
    }

}
