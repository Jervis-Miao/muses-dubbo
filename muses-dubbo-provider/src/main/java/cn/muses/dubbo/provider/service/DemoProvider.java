/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.dubbo.provider.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Value;

import cn.muses.dubbo.api.DubboProviderDemo;

/**
 * @author miaoqiang
 * @date 2021/1/14.
 */
@DubboService
public class DemoProvider implements DubboProviderDemo {

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String test() {
        return String.format("[%s] : Hello, %s", serviceName, "$Name");
    }
}
