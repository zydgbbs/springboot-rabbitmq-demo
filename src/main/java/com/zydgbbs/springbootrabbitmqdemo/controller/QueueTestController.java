package com.zydgbbs.springbootrabbitmqdemo.controller;

import com.zydgbbs.springbootrabbitmqdemo.dao.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueueTestController {

    @Autowired
    private Sender sender;

    @RequestMapping("/send")
    public String send(){
        sender.send("测试Queue");
        return "success";
    }

}
