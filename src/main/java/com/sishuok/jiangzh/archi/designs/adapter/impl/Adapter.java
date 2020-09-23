package com.sishuok.jiangzh.archi.designs.adapter.impl;

public class Adapter implements Target{

    // 持有具体的业务处理对象
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // 增加自己的业务处理
        System.out.println("this is adapter");
        // 酌情调用adaptee的业务处理
        adaptee.specificRequest();
    }
}
