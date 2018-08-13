package com.example.soaconsumer.controller;

import com.example.soaconsumer.service.inter.IStockQuery;
import com.example.soaconsumer.service.inter.IStockUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangchaoshuai
 * @date 2018/08/03 下午 06:51
 * @desc
 */
@RestController
@RequestMapping(value = {"stock"}, produces = "application/json;charset=UTF-8")
public class ConsumerController {
    @Autowired
    IStockQuery stockQuery;

    @Autowired
    IStockUpdate stockUpdate;

    @RequestMapping("queryStock")
    public String queryStock() {
        return stockQuery.queryStock();
    }

    @RequestMapping("updateStock")
    public String updateStock() {
        return stockUpdate.updateStock();
    }
}
