package com.sishuok.jiangzh.archi.designs.strategy.demo.v3;

import com.sishuok.jiangzh.archi.designs.strategy.demo.v2.PriceContext;
import com.sishuok.jiangzh.archi.designs.strategy.demo.v2.PriceStrategy;
import com.sishuok.jiangzh.archi.designs.strategy.demo.v2.StudentUserStrategyImpl;

public class StrategyV3Client {

    public static void main(String[] args) {
//        V3PriceStrategy priceStrategy = new V3NewUserStrategyImpl();
//        V3PriceStrategy priceStrategy = new V3StudentUserStrategyImpl();
        V3PriceStrategy priceStrategy = new V3OldUserStrategyImpl();

        double originPrice = 1000.0;
        double nowPrice = 900.0;

        V3PriceContext context = new V3PriceContext(priceStrategy);
//        context.setOriginPrice(originPrice);
        context.setNowPrice(nowPrice);

        System.out.println("quota = " + context.quota());

    }

}
