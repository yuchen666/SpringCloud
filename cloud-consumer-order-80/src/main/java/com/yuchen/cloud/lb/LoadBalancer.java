package com.yuchen.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author yuchen
 * 2020/3/23/023 22:06
 **/

public interface LoadBalancer {
    /**
     * 容器加载的时候，获取Eureka中所有的集群服务
     */
    ServiceInstance instances(List<ServiceInstance> instances);
}
