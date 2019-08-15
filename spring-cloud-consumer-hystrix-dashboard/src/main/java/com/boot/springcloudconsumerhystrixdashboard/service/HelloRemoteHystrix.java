package com.boot.springcloudconsumerhystrixdashboard.service;

import org.springframework.stereotype.Component;

/**
 * 熔断器
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(String name) {
        return "hello" +name+", this messge send failed ";
    }
}
