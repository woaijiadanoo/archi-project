package com.sishuok.jiangzh.archi.designs.strategy.demo.v3;

public class V3OldUserStrategyImpl implements V3PriceStrategy {
    @Override
    public double calcPrice(V3PriceContext context) {
        // 老用户折扣5%
        return context.getNowPrice() * (1-0.05);
    }
}

