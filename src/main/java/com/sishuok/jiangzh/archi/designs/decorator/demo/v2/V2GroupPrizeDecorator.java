package com.sishuok.jiangzh.archi.designs.decorator.demo.v2;

import com.sishuok.jiangzh.archi.designs.decorator.demo.DecoratorDB;

import java.util.Collection;

public class V2GroupPrizeDecorator extends V2Decorator{

    public V2GroupPrizeDecorator(V2Prize prize) {
        super(prize);
    }

    /*
        业务经理获取团队总销售额的1%
     */
    @Override
    public double calcPrize(String user) {
        double initPrize =  super.calcPrize(user);
        if(!isManager(user)){
            return initPrize;
        }
        double total = 0.0;
        // 获取团队总收益
        Collection<Double> values = DecoratorDB.db.values();
        for(Double value : values){
            total += value;
        }
        initPrize += total * 0.01;
        return initPrize;
    }

    // 判断是否是业务经理
    private boolean isManager(String user){
        if("Allen".equals(user)){
            return true;
        }
        return false;
    }
}
