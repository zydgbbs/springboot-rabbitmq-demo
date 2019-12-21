package com.zydgbbs.springbootrabbitmqdemo;

import com.zydgbbs.springbootrabbitmqdemo.dao.Sender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QueueTest {

    @Autowired
    private Sender sender;

    @Test
    public void send(){
        while (true)
            sender.send("ceshila");
    }

}
