/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.dubbo.config;

import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.muses.dubbo.api.DubboProviderDemo;

/**
 * @author miaoqiang
 * @date 2021/1/14.
 */
@Configuration
public class TestConfig {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @DubboReference(url = "dubbo://127.0.0.1:12345")
    private DubboProviderDemo providerDemo;

    @Bean
    public ApplicationRunner runner() {
        logger.info(providerDemo.test());
        return args -> logger.info(providerDemo.test());
    }
}
