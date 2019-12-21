package com.zydgbbs.springbootrabbitmqdemo.fanout.dao;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    //交换器名称
    @Value("${mq.config.topic.exchange}")
    private String exchange;

    public void fanoutSend(String msg){

        rabbitTemplate.convertAndSend(exchange,null,msg);
    }
}
