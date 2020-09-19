package com.sishuok.jiangzh.archi.designs.strategy.impl;

public class Context {
    // 持有算法策略对象
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        // 具体执行算法内容
        strategy.algorithmInterface();
    }

}
