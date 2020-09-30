package com.sishuok.jiangzh.archi.designs.memento.demo.v2;


public class MementoV2Client {

    public static void main(String[] args) {
        V2UserMock v2UserMock = new V2UserMock();
        // 初始化数据 -> visio 用户认证
        v2UserMock.userAuth();

        // 记录快照
        UserMockMemento memento = v2UserMock.createMemento();
        // 保存快照
        V2UserMockCareTaker careTaker = new V2UserMockCareTaker();
        careTaker.saveMemento(memento);

        // 开展一系列的实验
        v2UserMock.schemaOne();

        // 还原初始化数据
        v2UserMock.setMemento(memento);
        v2UserMock.schemaTwo();

    }

}
