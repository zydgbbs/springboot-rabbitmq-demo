package com.zydgbbs.springbootrabbitmqdemo.dao;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    /**
     * 发送消息
     * @param msg
     */
    public void send(String msg){
        //队列名称，消息
        rabbitTemplate.convertAndSend("hello-queue",msg);
    }

}
