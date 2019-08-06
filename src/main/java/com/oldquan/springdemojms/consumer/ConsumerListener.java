package com.oldquan.springdemojms.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author : zhanyang.quan
 * @description : 消息监听者
 * @create : 2019/8/6  10:27
 */
@Component
public class ConsumerListener {

    @JmsListener(destination = "queue.test")
    public void receive(String message) {
        System.err.println("消费者接收到消息：" + message);
    }
}


