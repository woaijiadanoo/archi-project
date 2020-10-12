package com.sishuok.jiangzh.archi.designs.proxy.demo.staticproxy;

public class ProxyRealSubject implements ProxyStaticAPI{
    @Override
    public void request() {
        System.out.println("static proxy realSubject");
    }
}
