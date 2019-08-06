package com.oldquan.springdemojms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication(scanBasePackages = {"com.oldquan.springdemojms"})
public class SpringdemojmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringdemojmsApplication.class, args);
    }
}
