package com.sishuok.jiangzh.archi.designs.strategy.demo.v3;


public class V3StudentUserStrategyImpl implements V3PriceStrategy {
    @Override
    public double calcPrice(V3PriceContext context) {
        // 学生用户折扣25%
        return context.getOriginPrice() * (1-0.25);
    }
}

