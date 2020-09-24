package com.sishuok.jiangzh.archi.designs.observer.impl;

public class ConcreteObserver implements Observer{

    private String observerState;

    @Override
    public void update(Subject subject) {
        ConcreteSubject concreteSubject = (ConcreteSubject) subject;
        // 获取改变以后的状态
        observerState = concreteSubject.getSubjectState();
    }

    public String getObserverState() {
        return observerState;
    }
}
