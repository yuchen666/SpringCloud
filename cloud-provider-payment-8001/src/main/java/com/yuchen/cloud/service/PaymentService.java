package com.yuchen.cloud.service;

import com.yuchen.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author yuchen
 * 2020/3/21/021 13:09
 **/
public interface PaymentService {
    /**
     * 创建
     *
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 查询
     *
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
