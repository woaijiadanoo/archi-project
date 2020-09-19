package com.sishuok.jiangzh.archi.designs.strategy.demo.v3;

import com.sishuok.jiangzh.archi.designs.strategy.demo.v2.PriceStrategy;

public class V3NewUserStrategyImpl implements V3PriceStrategy {
    @Override
    public double calcPrice(V3PriceContext context) {
        // 新用户折扣30%
        return context.getOriginPrice() * (1-0.3);
    }
}

