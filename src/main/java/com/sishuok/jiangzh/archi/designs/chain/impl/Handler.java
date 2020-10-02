package com.sishuok.jiangzh.archi.designs.chain.impl;

public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor){
        this.successor = successor;
    }

    public abstract void handleRequest();

}
