package com.yuchen.cloud.controller;

import com.yuchen.cloud.entities.CommonResult;
import com.yuchen.cloud.entities.Payment;
import com.yuchen.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yuchen
 * 2020/3/21/021 13:11
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("********插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入成功。", result);
        } else {
            return new CommonResult(444, "插入失败！", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("********查询结果：" + payment + "/t" + "重启了！");
        if (payment != null) {
            return new CommonResult(200, "查询成功。端口号是：" + serverPort, payment);
        } else {
            return new CommonResult(444, "没有记录，查询id + " + id, null);
        }

    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }
}
