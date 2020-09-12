package com.sishuok.jiangzh.archi.designs.decorator.demo.v1;

import com.sishuok.jiangzh.archi.designs.decorator.demo.DecoratorDB;

import java.util.Collection;

public class V1Prize {

    // 计算业务提成
    public double calcPrize(String user){
        double prize = 0.0;

        // 计算当月销售额
        prize += monthPrize(user);

        // 判断是否是业务经理，如果是则增加团队销售额
        if(isManager(user)){
            prize += groupPrize();
        }

        // 计算全年销售额的提成
//        prize += totalPrize(user);

        return prize;
    }

    // 判断是否是业务经理
    private boolean isManager(String user){
        if("Allen".equals(user)){
            return true;
        }
        return false;
    }

    // 当月销售额 , 3%
    private double monthPrize(String user){
        double prize = 0.0;
        prize = DecoratorDB.db.get(user);
        return prize * 0.03;
    }

    // 团队总收入 1%
    private double groupPrize(){
        double prize = 0.0;
        double total = 0.0;

        // 获取团队总收益
        Collection<Double> values = DecoratorDB.db.values();
        for(Double value : values){
            total += value;
        }

        prize = total * 0.01;

        return prize;
    }

    // 计算全年总收入 1%
    private double totalPrize(String user){
        double total = 10000.0;
        double prize = total * 0.01;
        return prize;
    }

}
