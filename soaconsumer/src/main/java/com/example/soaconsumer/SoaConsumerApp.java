package com.example.soaconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author zhangchaoshuai
 * @date 2018/08/03 下午 07:05
 * @desc
 */
@SpringBootApplication
@DubboComponentScan("com.example.soaconsumer.service")
/*上述dubboscan感觉没用（通过你打印日志就可以看出，但是必须得有，不然消费者无法注册到zookeeper上）*/
public class SoaConsumerApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SoaConsumerApp.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }
}