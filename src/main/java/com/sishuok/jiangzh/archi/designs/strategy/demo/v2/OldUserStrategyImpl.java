package com.sishuok.jiangzh.archi.designs.strategy.demo.v2;

public class OldUserStrategyImpl implements PriceStrategy {
    @Override
    public double calcPrice(double originPrice) {
        // 老用户折扣5%
        return originPrice * (1-0.05);
    }
}

