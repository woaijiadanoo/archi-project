package com.sishuok.jiangzh.archi.designs.observer.demo.v2;

import com.sishuok.jiangzh.archi.designs.observer.impl.Observer;

import java.util.ArrayList;
import java.util.List;

public class V2NewsPaperRegister {

    private List<V2Observer> observers = new ArrayList<>();

    /*
        注册观察者
     */
    public void attach(V2Observer observer){
        observers.add(observer);
    }

    // 退出、心跳异常
    public void detach(V2Observer observer){
        observers.remove(observer);
    }

    public void notifyNewsPaper(){
        for(V2Observer observer : observers){
            observer.getNewsPaper(this);
        }
    }

}
