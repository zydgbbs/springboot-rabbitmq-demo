package com.zydgbbs.springbootrabbitmqdemo.ack.dao;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AckSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    //交换器名称
    @Value("${mq.config.ack.exchange}")
    private String exchange;

    //路由键
    @Value("${mq.config.queue.ack.routing.key}")
    private String infoRoutingKey;

    public void ackSend(String msg){
        rabbitTemplate.convertAndSend(exchange,infoRoutingKey,msg);
    }
}
