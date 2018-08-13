package com.example.sopprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.soaparent.IUpdateStockService;

import java.util.Random;

/**
 * @author zhangchaoshuai
 * @date 2018/08/01 下午 02:28
 * @desc
 */
@Service(version = "2.0.0")
public class UpdateStockServiceImpl implements IUpdateStockService {
    @Override
    public String updateStocks(String supplySid, Long stockNum) {
        System.out.println("--- updateStockImpl ---");
        return supplySid + "-" + stockNum + "RET-" + new Random().nextDouble();
    }
}
