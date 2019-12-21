package com.zydgbbs.springbootrabbitmqdemo;

import com.zydgbbs.springbootrabbitmqdemo.ack.dao.AckSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AckSendTest {

    @Autowired
    private AckSender ackSender;

    @Test
    public void test(){
        ackSender.ackSend("ack");
    }
}
