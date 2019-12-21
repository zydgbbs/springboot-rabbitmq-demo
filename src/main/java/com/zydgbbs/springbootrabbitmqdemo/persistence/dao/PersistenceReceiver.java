package com.zydgbbs.springbootrabbitmqdemo.persistence.dao;

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
 * autoDelete:是否是一个可删除的临时队列，当所有消费者断开连接后，是否自动删除
 *
 * @Exchange
 * autoDelete:当所有绑定队列都不再使用时，是否自动删除交换器
 *
 */
@Component
@RabbitListener(
        bindings = @QueueBinding(
                value = @Queue(value = "${mq.config.queue.persistence}",autoDelete = "false"),
                exchange = @Exchange(value = "${mq.config.persistence.exchange}",type= ExchangeTypes.DIRECT),
                key = "${mq.config.queue.persistence.routing.key}"
        )
)
public class PersistenceReceiver {

    @RabbitHandler
    public void process(String msg){
        System.out.println("Persistence Receive："+msg);
    }
}
