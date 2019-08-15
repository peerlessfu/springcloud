package com.boot.springcloudproduct2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping
    public String index(@RequestParam String name){
        return "hello "+name+",this is first message by producer2";
    }
}
