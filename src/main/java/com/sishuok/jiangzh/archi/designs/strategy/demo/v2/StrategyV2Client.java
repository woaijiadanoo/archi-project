package com.sishuok.jiangzh.archi.designs.strategy.demo.v2;

public class StrategyV2Client {

    public static void main(String[] args) {
//        PriceStrategy strategy = new NewUserStrategyImpl();
        PriceStrategy strategy = new StudentUserStrategyImpl();
//        PriceStrategy strategy = new OldUserStrategyImpl();

        PriceContext context = new PriceContext(strategy);

        double originPrice = 1000.0;
        double quota = context.quota(originPrice);

        System.out.println("quota = " + quota);

    }

}
