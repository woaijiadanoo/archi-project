package com.sishuok.jiangzh.archi.designs.SimpleFactory.impl;

import com.sishuok.jiangzh.archi.designs.SimpleFactory.privoder.SimpleFactory;
import com.sishuok.jiangzh.archi.designs.SimpleFactory.privoder.SimpleFactoryApi;

public class SimpleClient {

    public static void main(String[] args) {
//        SimpleFactoryApi api = new SimpleFactoryImplA();
//        api.test1("Hello World");

        SimpleFactoryApi api = SimpleFactory.createApi("B");
        api.test1("Hello World");
    }

}
