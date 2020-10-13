package com.sishuok.jiangzh.archi.designs.proxy.demo.dymic_proxy;

public class DynamicProxyClient {

    public static void main(String[] args) {
        DynamicProxyAPI api = new DynamicProxyImpl();

        // 组织代理对象
        DynamicProxy dynamicProxy = new DynamicProxy();
        DynamicProxyAPI proxy = (DynamicProxyAPI)dynamicProxy.getProxyInstance(api);

        // 调用代理对象内容
        proxy.request();
    }

}
