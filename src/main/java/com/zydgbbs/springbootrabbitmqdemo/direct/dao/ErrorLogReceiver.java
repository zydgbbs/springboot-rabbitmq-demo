package com.zydgbbs.springbootrabbitmqdemo.direct.dao;

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
/*
@Component
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.queue.error}",autoDelete = "true"),
                exchange = @Exchange(value = "${mq.config.exchange}",type= ExchangeTypes.DIRECT),
                key = "${mq.config.queue.error.routing.key}"
        )
)
public class ErrorLogReceiver {

    @RabbitHandler
    public void process(String msg){
        System.out.println("Error Receive："+msg);
    }
}
*/
