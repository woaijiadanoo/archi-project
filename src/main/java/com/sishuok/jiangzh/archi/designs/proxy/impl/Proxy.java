package com.sishuok.jiangzh.archi.designs.proxy.impl;



public class Proxy implements Subject{

    private Subject realSubject;

    public Proxy(Subject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        realSubject.request();
    }
}
