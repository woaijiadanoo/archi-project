package com.sishuok.jiangzh.archi.designs.composite.impl;

public abstract class Component {

    // 具体业务具体实现
    public abstract void someOperation();

    // 维护树枝节点之间的关系
    // 之所以抛异常， 是因为树叶节点不支持， 树枝节点需要自己维护一套内容
    public void addChild(Component component){
        throw new UnsupportedOperationException("对象不支持此操作");
    }

    public void removeChild(Component component){
        throw new UnsupportedOperationException("对象不支持此操作");
    }

    public Component getChildren(int index){
        throw new UnsupportedOperationException("对象不支持此操作");
    }

}
