package com.sishuok.jiangzh.archi.designs.strategy.demo.v3;

import com.sishuok.jiangzh.archi.designs.strategy.demo.v2.PriceStrategy;

public class V3PriceContext {

    private V3PriceStrategy strategy;
    // 原始金额
    private double originPrice;
    // 折扣以后的金额
    private double nowPrice;

    public V3PriceContext(V3PriceStrategy strategy){
        this.strategy = strategy;
    }



    public double quota(){
        return this.strategy.calcPrice(this);
    }

    public V3PriceStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(V3PriceStrategy strategy) {
        this.strategy = strategy;
    }

    public double getNowPrice() {
        return nowPrice;
    }

    public void setNowPrice(double nowPrice) {
        this.nowPrice = nowPrice;
    }

    public double getOriginPrice() {
        return originPrice;
    }


    public void setOriginPrice(double originPrice) {
        this.originPrice = originPrice;
    }
}
