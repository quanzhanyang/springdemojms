package com.oldquan.springdemojms.subscriber;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author : zhanyang.quan
 * @description : 消息订阅者
 * @create : 2019/8/6  10:56
 */
@Component
public class TopicSub {
    @JmsListener(destination = "topic.test",containerFactory = "topicListenerContainerFactory")
    public void receive1(String message) {
//        System.err.println("Topic.Subscribe.receive1接收消息：" + message);
        System.out.println("Topic.Subscribe.receive1接收消息：" + message);
    }

    @JmsListener(destination = "topic.test",containerFactory = "topicListenerContainerFactory")
    public void receive2(String message) {
//        System.err.println("Topic.Subscribe.receive2接收消息：" + message);
        System.out.println("Topic.Subscribe.receive2接收消息：" + message);
    }

    @JmsListener(destination = "topic.test"/*,containerFactory = "topicListenerContainerFactory"*/)
    public void receive3(String message) {
//        System.err.println("Topic.Subscribe.receive3接收消息：" + message);
        System.out.println("Topic.Subscribe.receive3接收消息：" + message);
    }

    @JmsListener(destination = "topic.test"/*,containerFactory = "topicListenerContainerFactory"*/)
    public void receive4(String message) {
//        System.err.println("Topic.Subscribe.receive4接收消息：" + message);
        System.out.println("Topic.Subscribe.receive4接收消息：" + message);
    }
}
