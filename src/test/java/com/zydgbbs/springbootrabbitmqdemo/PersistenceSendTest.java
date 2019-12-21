package com.zydgbbs.springbootrabbitmqdemo;

import com.zydgbbs.springbootrabbitmqdemo.persistence.dao.PersistenceSender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersistenceSendTest {

    @Autowired
    private PersistenceSender persistenceSender;

    @Test
    public void send() throws Exception{
        int flag = 0;
        while(true){
            flag++;
            Thread.sleep(100);
            persistenceSender.persistenceSend("Persistence : " + flag);
        }
    }
}
