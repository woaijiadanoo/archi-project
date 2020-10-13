package com.sishuok.jiangzh.archi.designs.proxy.demo.dymic_proxy;

public class DynamicProxyImpl implements DynamicProxyAPI {
    @Override
    public void request() {
        System.out.println("this is DynamicProxyImpl");
    }
}
