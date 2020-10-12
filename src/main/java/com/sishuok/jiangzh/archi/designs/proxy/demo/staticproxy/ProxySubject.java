package com.sishuok.jiangzh.archi.designs.proxy.demo.staticproxy;

public class ProxySubject implements ProxyStaticAPI{

    private ProxyStaticAPI api = new ProxyRealSubject();

    @Override
    public void request() {
        api.request();
    }
}
