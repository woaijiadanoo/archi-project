package com.sishuok.jiangzh.archi.designs.observer.impl;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    /*
        维护观察者列表
     */
    private List<Observer> observers = new ArrayList<>();

    /*
        注册观察者
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    // 退出、心跳异常
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /*
        当有内容修改时，通知所有的订阅者
     */
    public void notifyObsevers(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }

}
