/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @author miaoqiang
 * @date 2021/1/14.
 */
@EnableAutoConfiguration
public class DubboProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApp.class);
    }
}
