package com.yuchen.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author yuchen
 * 2020/3/23/023 19:56
 **/
@RestController
public class PaymentConsulController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/consul")
    public String paymentConsul(){
        return "Spring Cloud with Consul Server Port is："+serverPort + "\t" + UUID.randomUUID();
    }

}
