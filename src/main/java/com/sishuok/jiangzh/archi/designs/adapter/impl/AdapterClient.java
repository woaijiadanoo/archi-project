package com.sishuok.jiangzh.archi.designs.adapter.impl;

public class AdapterClient {

    public static void main(String[] args) {
        // 准备工作
        Adaptee adaptee = new Adaptee();

        // 客户端处理
        Target target = new Adapter(adaptee);
        // 业务处理
        target.request();

    }

}
