package com.boot.springcloudproducer.controller;

import com.boot.springcloudproducer.mq.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private MsgProducer msgProducer;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return "hello "+name+",this is first message by producer";
    }

    @RequestMapping("/helloMsg")
    public void helloMsg(String content){
        msgProducer.sendMsgA(content);
        //msgProducer.sendMsgB(content);
    }
}
