package com.yuchen.cloud.controller;

import com.yuchen.cloud.entities.CommonResult;
import com.yuchen.cloud.entities.Payment;
import com.yuchen.cloud.service.PaymentFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yuchen
 * 2020/3/23/023 23:03
 **/
@RestController
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeOut(){
        /**
         * openfeign-ribbon，客户端一般默认等待一秒
         */
        return paymentFeignService.paymentFeignTimeOut();
    }

}
