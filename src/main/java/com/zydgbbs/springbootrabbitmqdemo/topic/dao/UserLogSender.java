package com.zydgbbs.springbootrabbitmqdemo.topic.dao;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserLogSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    //交换器名称
    @Value("${mq.config.exchange}")
    private String exchange;

    public void userSend(String msg){
        /*
         * 交换器名称
         * 路由键
         * 消息
         */
        rabbitTemplate.convertAndSend(exchange,"user.log.debug","user debug:"+msg);
        rabbitTemplate.convertAndSend(exchange,"user.log.error","user error:"+msg);
        rabbitTemplate.convertAndSend(exchange,"user.log.info","user info:"+msg);
        rabbitTemplate.convertAndSend(exchange,"user.log.warn","user error:"+msg);

    }

}
