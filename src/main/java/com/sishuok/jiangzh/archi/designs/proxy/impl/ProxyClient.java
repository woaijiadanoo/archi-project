package com.sishuok.jiangzh.archi.designs.proxy.impl;

public class ProxyClient {

    public static void main(String[] args) {
        Subject subject = new RealSubject();

        // Client从这里开始执行
        Subject invokerSubject = new Proxy(subject);
        invokerSubject.request();
    }

}
