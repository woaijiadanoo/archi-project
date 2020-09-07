package com.sishuok.jiangzh.archi.designs.SimpleFactory.privoder;

public class SimpleFactoryImplA implements SimpleFactoryApi {
    @Override
    public void test1(String str) {
        System.out.println("str A = " + str);
    }
}
