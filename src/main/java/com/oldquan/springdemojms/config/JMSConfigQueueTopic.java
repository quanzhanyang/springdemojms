package com.oldquan.springdemojms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

import javax.jms.ConnectionFactory;

/**
 * @author : zhanyang.quan
 * @description : JMS点对点 topic共存配置类
 * @create : 2019/8/6  11:08
 */
@Configuration
public class JMSConfigQueueTopic {
    @Bean
    public JmsListenerContainerFactory<?> topicListenerContainerFactory(ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setPubSubDomain(true);
        factory.setConnectionFactory(connectionFactory);
        return factory;
    }
}
