package com.sishuok.jiangzh.archi.designs.decorator.demo.v2;

public abstract class V2Decorator extends V2Prize{

    private V2Prize prize;

    public V2Decorator(V2Prize prize){
        this.prize = prize;
    }

    @Override
    public double calcPrize(String user) {
        return prize.calcPrize(user);
    }
}
