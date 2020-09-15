package com.sishuok.jiangzh.archi.designs.bridge.impl;

public abstract class Abstraction {

    private Implementor implementor;

    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operationImpl();
    }

}
