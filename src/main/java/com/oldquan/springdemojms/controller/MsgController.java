package com.oldquan.springdemojms.controller;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhanyang.quan
 * @description : 消息发送接口
 * @create : 2019/8/6  10:30
 */
@RestController
public class MsgController {
    private final JmsTemplate jmsTemplate;

    public MsgController(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @GetMapping("/send")
    public String sendMsg(String msg) {
        jmsTemplate.convertAndSend("queue.test", msg);
        return "SUCCESS";
    }
    @GetMapping("/sendTopic")
    public String sendTopic(String msg) {
        jmsTemplate.convertAndSend(new ActiveMQTopic("topic.test"), msg);
        return "SUCCESS";
    }
}
