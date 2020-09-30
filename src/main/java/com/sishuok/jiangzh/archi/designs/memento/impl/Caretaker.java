package com.sishuok.jiangzh.archi.designs.memento.impl;

public class Caretaker {

    // 待记录的被保存对象
    private Memento memento = null;

    // 保存镜像快照
    public void saveMemento(Memento memento){
        this.memento = memento;
    }

    // 恢复被保存的快照对象
    public Memento retriveMemento(){
        return memento;
    }

}
