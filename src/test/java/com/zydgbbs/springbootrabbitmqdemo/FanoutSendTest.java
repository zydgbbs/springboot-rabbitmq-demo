package com.zydgbbs.springbootrabbitmqdemo;

import com.zydgbbs.springbootrabbitmqdemo.fanout.dao.FanoutSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FanoutSendTest {

    @Autowired
    private FanoutSender fanoutSender;

    @Test
    public void fanoutSend() throws Exception{
        while (true){
            Thread.sleep(10);
            fanoutSender.fanoutSend("fanout");
        }

    }
}
