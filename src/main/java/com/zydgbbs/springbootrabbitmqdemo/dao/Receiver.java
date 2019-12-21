package com.zydgbbs.springbootrabbitmqdemo.dao;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component

public class Receiver {

    @RabbitListener(queues = "hello-queue")
    @RabbitHandler
    public void process(String hello){
        System.out.println("接收到消息："+hello);
    }

}
