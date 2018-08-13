package com.example;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author zhangchaoshuai
 * @date 2018/08/01 下午 02:42
 * @desc
 */
@SpringBootApplication
@DubboComponentScan("com.example.sopprovider.impl")
public class SoaProviderApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SoaProviderApp.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }
}
