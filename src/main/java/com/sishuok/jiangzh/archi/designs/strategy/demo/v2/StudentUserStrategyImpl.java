package com.sishuok.jiangzh.archi.designs.strategy.demo.v2;

public class StudentUserStrategyImpl implements PriceStrategy {
    @Override
    public double calcPrice(double originPrice) {
        // 学生用户折扣25%
        return originPrice * (1-0.25);
    }
}

