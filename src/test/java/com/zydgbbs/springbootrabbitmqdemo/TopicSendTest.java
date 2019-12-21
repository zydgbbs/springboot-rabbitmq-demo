package com.zydgbbs.springbootrabbitmqdemo;

import com.zydgbbs.springbootrabbitmqdemo.topic.dao.OrderLogSender;
import com.zydgbbs.springbootrabbitmqdemo.topic.dao.ProductLogSender;
import com.zydgbbs.springbootrabbitmqdemo.topic.dao.UserLogSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TopicSendTest {

    @Autowired
    private OrderLogSender orderLogSender;
    @Autowired
    private ProductLogSender productLogSender;
    @Autowired
    private UserLogSender userLogSender;

    @Test
    public void logSend() throws Exception{
        while (true) {
            Thread.sleep(10);
            orderLogSender.orderSend("订单来啦");
            productLogSender.productSend("产品来啦");
            userLogSender.userSend("用户来啦");
        }
    }
}
