package com.sishuok.jiangzh.archi.designs.observer.impl;

public class ConcreteSubject extends  Subject{

    // 业务抽象为状态修改
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;

        // 如果状态发生改变，要通知所有的观察者
        this.notifyObsevers();
    }
}
