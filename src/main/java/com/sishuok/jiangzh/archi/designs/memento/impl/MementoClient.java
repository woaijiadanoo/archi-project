package com.sishuok.jiangzh.archi.designs.memento.impl;

public class MementoClient {

    public static void main(String[] args) {
        Originator originator = new Originator("init");

        // 获取到了原始待保存状态的对象
        Memento memento = originator.createMemento();

        // 保存结果
        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(memento);

        // 假装办了一些业务
        originator.setState("init, one");
        System.out.println(originator.getState());

        // 还原数据
        originator.setMemento(caretaker.retriveMemento());
        System.out.println(originator.getState());

    }

}
