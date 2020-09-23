package com.sishuok.jiangzh.archi.designs.singleton.impl;

public class Singleton {
    // 防止别人在外部创建实例
    private Singleton(){}

    // 控制实例数量
    private static Singleton singleton = new Singleton();

    /*
        这样就能保证每次访问返回的都是同一个实例
     */
    public static Singleton getInstance(){
        return singleton;
    }

}
