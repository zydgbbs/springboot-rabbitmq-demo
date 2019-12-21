package com.zydgbbs.springbootrabbitmqdemo.topic.dao;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class OrderLogSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    //交换器名称
    @Value("${mq.config.exchange}")
    private String exchange;

    public void orderSend(String msg){
        /*
         * 交换器名称
         * 路由键
         * 消息
         */
        rabbitTemplate.convertAndSend(exchange,"order.log.debug","order debug:"+msg);
        rabbitTemplate.convertAndSend(exchange,"order.log.error","order error:"+msg);
        rabbitTemplate.convertAndSend(exchange,"order.log.info","order info:"+msg);
        rabbitTemplate.convertAndSend(exchange,"order.log.warn","order error:"+msg);

    }

}
