package com.example.sopprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.example.soabean.StockDTO;
import com.example.soaparent.IQueryStockService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhangchaoshuai
 * @date 2018/08/01 下午 02:28
 * @desc
 */
@Service(version = "1.0.0")
public class QueryStockServiceImpl implements IQueryStockService {

    @Override
    public List<StockDTO> queryStocks(String supplySid) {
        System.out.println("--- 开始请求了 ---");
        StockDTO stockDTO = new StockDTO();
        stockDTO.setOptUpdateTime("update time " + supplySid);
        stockDTO.setProductSid("product sid " + supplySid);
        List<StockDTO> list = new ArrayList<StockDTO>();
        list.add(stockDTO);
        System.out.println("--- 请求结束了 ---" + JSONObject.toJSONString(list));
        return list;
    }
}
