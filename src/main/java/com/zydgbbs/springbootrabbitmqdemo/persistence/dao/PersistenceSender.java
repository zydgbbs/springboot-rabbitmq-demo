package com.zydgbbs.springbootrabbitmqdemo.persistence.dao;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PersistenceSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    //交换器名称
    @Value("${mq.config.persistence.exchange}")
    private String exchange;

    //路由键
    @Value("${mq.config.queue.persistence.routing.key}")
    private String infoRoutingKey;

    public void persistenceSend(String msg){
        rabbitTemplate.convertAndSend(exchange,infoRoutingKey,msg);
    }
}
