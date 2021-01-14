/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.dubbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author miaoqiang
 * @date 2021/1/14.
 */
@SpringBootApplication
public class DubboComposeApp {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public static void main(String[] args) {
        SpringApplication.run(DubboComposeApp.class);
    }
}
