package com.sishuok.jiangzh.archi.designs.flyweight.impl;

/*
    需要大家共享的数据
 */
public class ConcreteFlyweight implements Flyweight{

    // 内部状态
    private String intrinsicState;

    public ConcreteFlyweight(String state){
        this.intrinsicState = state;
    }

    @Override
    public void operation(String extrinsicState) {

    }
}
