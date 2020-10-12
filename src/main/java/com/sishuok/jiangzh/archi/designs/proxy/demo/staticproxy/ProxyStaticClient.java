package com.sishuok.jiangzh.archi.designs.proxy.demo.staticproxy;

public class ProxyStaticClient {

    public static void main(String[] args) {
        ProxyStaticAPI api = new ProxySubject();

        api.request();
    }

}
