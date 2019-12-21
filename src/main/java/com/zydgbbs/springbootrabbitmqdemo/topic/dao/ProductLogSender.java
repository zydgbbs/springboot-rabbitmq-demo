package com.zydgbbs.springbootrabbitmqdemo.topic.dao;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProductLogSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    //交换器名称
    @Value("${mq.config.exchange}")
    private String exchange;

    public void productSend(String msg){
        /*
         * 交换器名称
         * 路由键
         * 消息
         */
        rabbitTemplate.convertAndSend(exchange,"product.log.debug","product debug:"+msg);
        rabbitTemplate.convertAndSend(exchange,"product.log.error","product error:"+msg);
        rabbitTemplate.convertAndSend(exchange,"product.log.info","product info:"+msg);
        rabbitTemplate.convertAndSend(exchange,"product.log.warn","product error:"+msg);

    }

}
