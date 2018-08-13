package com.example.soabean;

import java.io.Serializable;

/**
 * @author zhangchaoshuai
 * @date 2018/07/31 下午 04:49
 * @desc
 */
public class StockDTO implements Serializable {
    private String saleTime; // 最近销售时间
    private String productSid; // 网站计算相同sku累加库存
    private String optUpdateTime; // 操作时间
    private String stockNum;

    public String getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(String saleTime) {
        this.saleTime = saleTime;
    }

    public String getProductSid() {
        return productSid;
    }

    public void setProductSid(String productSid) {
        this.productSid = productSid;
    }

    public String getOptUpdateTime() {
        return optUpdateTime;
    }

    public void setOptUpdateTime(String optUpdateTime) {
        this.optUpdateTime = optUpdateTime;
    }

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum;
    }
}
