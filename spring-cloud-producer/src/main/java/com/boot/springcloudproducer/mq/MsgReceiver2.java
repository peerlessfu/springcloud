package com.boot.springcloudproducer.mq;

import com.boot.springcloudproducer.config.RabbitMqConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitMqConfig.QUEUE_B)
public class MsgReceiver2 {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RabbitHandler
    public void process(String content) {
        logger.info("接收处理队列B当中的消息： " + content);
    }
}

