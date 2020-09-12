package com.sishuok.jiangzh.archi.designs.decorator.demo.v2;

import com.sishuok.jiangzh.archi.designs.decorator.demo.DecoratorDB;

public class V2MonthPrizeDecorator extends V2Decorator{
    public V2MonthPrizeDecorator(V2Prize prize) {
        super(prize);
    }

    /*
        计算月度奖金
     */
    @Override
    public double calcPrize(String user) {
        // 初始奖金额
        double initPrize = super.calcPrize(user);
        initPrize += DecoratorDB.db.get(user);
        return initPrize * 0.03;
    }
}
