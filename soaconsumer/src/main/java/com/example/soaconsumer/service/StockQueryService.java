package com.example.soaconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.example.soabean.StockDTO;
import com.example.soaconsumer.service.inter.IStockQuery;
import com.example.soaparent.IQueryStockService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangchaoshuai
 * @date 2018/08/03 下午 06:51
 * @desc
 */
@Service
public class StockQueryService implements IStockQuery {

    @Reference(check = false, version = "1.0.0")
    IQueryStockService queryStockService;

    public String queryStock() {
        List<StockDTO> list = queryStockService.queryStocks(String.valueOf(Math.random()));
        return JSONObject.toJSONString(list);
    }
}
