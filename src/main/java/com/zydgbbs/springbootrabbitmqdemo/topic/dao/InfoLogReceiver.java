package com.zydgbbs.springbootrabbitmqdemo.topic.dao;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @RabbitListener：
 * bindings：绑定队列的名称
 * @QueueBinding
 * exchange:配置交换器
 * type:交换器的类型
 * @Queue：
 * value:配置的队列名称
 * autoDelete:是否是一个可删除的临时队列
 *
 */
@Component
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.queue.info}",autoDelete = "true"),
                exchange = @Exchange(value = "${mq.config.exchange}",type= ExchangeTypes.TOPIC),
                key = "*.log.info"
        )
)
public class InfoLogReceiver {

    @RabbitHandler
    public void process(String msg){
        System.out.println("Info Receive："+msg);
    }
}
