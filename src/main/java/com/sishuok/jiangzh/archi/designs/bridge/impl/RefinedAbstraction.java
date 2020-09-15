package com.sishuok.jiangzh.archi.designs.bridge.impl;

public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void otherOperation(){
        // TODO 业务前
        super.operation();
        // TODO 业务后
    }

}
