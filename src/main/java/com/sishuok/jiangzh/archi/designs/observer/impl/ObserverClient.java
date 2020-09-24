package com.sishuok.jiangzh.archi.designs.observer.impl;

public class ObserverClient {

    public static void main(String[] args) {
        // 准备工作
        ConcreteObserver observer = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject();

        // 订阅
        subject.attach(observer);

        // 发布状态变更
        System.out.println("test 1 state : "+ observer.getObserverState());

        subject.setSubjectState("状态修改");

        System.out.println("test 2 state : "+ observer.getObserverState());
    }

}
