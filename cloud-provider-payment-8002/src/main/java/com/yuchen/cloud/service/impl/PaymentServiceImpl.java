package com.yuchen.cloud.service.impl;

import com.yuchen.cloud.dao.PaymentDao;
import com.yuchen.cloud.entities.Payment;
import com.yuchen.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yuchen
 * 2020/3/21/021 13:09
 **/
@Service
public class PaymentServiceImpl implements PaymentService{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
