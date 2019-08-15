package com.boot.springcloudconsumerhystrixdashboard.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping("/hello")
    String hello(@RequestParam("name") String name);
}
