package com.sishuok.jiangzh.archi.designs.strategy.demo.v2;

public class StrategyV2Client2 {

    public static void main(String[] args) {
        String user = "Allen";
        PriceContext2 context = new PriceContext2(user);

        double originPrice = 1000.0;
        double quota = context.quota(originPrice);

        System.out.println("quota = " + quota);

    }

}
