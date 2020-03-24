package com.yuchen.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yuchen
 * 2020/3/23/023 22:09
 **/
@Component
public class MyLB implements LoadBalancer {

    /**
     * 设置一个初始值为0的原子类
     */
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current;
        int next;
        do {
            current = this.atomicInteger.get();
            /**
             * 加一个判断，整形的最大值为2147483647,防止越界
             */
            next = current >= 2147483647 ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("next = " + next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> instances) {
        /**
         * 第几次访问，与集群服务器数量取余，获得这次访问的服务
         */
        int index = this.getAndIncrement() % instances.size();
        return instances.get(index);
    }

}
