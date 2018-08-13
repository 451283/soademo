package com.example.soaconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.soaconsumer.service.inter.IStockUpdate;
import com.example.soaparent.IUpdateStockService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author zhangchaoshuai
 * @date 2018/08/03 下午 06:51
 * @desc
 */
@Service
public class StockUpdateService implements IStockUpdate {

    @Reference(check = false, version = "2.0.0")
    IUpdateStockService updateStockService;

    @Override
    public String updateStock() {
        System.out.println("--- updateStock ---");
        return updateStockService.updateStocks("supplySid-" + new Random().nextInt(100), new Random().nextLong());
    }
}
