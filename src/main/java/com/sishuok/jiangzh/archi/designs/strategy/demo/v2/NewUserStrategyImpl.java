package com.sishuok.jiangzh.archi.designs.strategy.demo.v2;

public class NewUserStrategyImpl implements PriceStrategy {
    @Override
    public double calcPrice(double originPrice) {
        // 新用户折扣30%
        return originPrice * (1-0.3);
    }
}

