package com.example.soaparent;

import com.example.soabean.StockDTO;

import java.util.List;
import java.util.Map;

/**
 * @author zhangchaoshuai
 * @date 2018/07/31 下午 04:41
 * @desc
 */
public interface IQueryStockService {
    List<StockDTO> queryStocks(String supplySid);
}
