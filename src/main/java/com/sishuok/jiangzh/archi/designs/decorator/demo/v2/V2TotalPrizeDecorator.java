package com.sishuok.jiangzh.archi.designs.decorator.demo.v2;

public class V2TotalPrizeDecorator extends V2Decorator{
    public V2TotalPrizeDecorator(V2Prize prize) {
        super(prize);
    }

    @Override
    public double calcPrize(String user) {
        double initPrize =  super.calcPrize(user);
        // 假定每个人一年都是销售了10000元
        double total = 10000;

        initPrize += total * 0.01;

        return initPrize;
    }
}
