package com.zydgbbs.springbootrabbitmqdemo.direct.dao;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component
public class LogSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    //交换器名称
    @Value("${mq.config.exchange}")
    private String exchange;

    //路由键
    @Value("${mq.config.queue.info.routing.key}")
    private String infoRoutingKey;

    @Value("${mq.config.queue.error.routing.key}")
    private String errorRoutingKey;

    public void sendInfo(String msg){
        *//*
         * 交换器名称
         * 路由键
         * 消息
         *//*
        rabbitTemplate.convertAndSend(exchange,infoRoutingKey,msg);
    }

    public void sendError(String msg){
        *//*
         * 交换器名称
         * 路由键
         * 消息
         *//*
        rabbitTemplate.convertAndSend(exchange,errorRoutingKey,msg);
    }
}*/
