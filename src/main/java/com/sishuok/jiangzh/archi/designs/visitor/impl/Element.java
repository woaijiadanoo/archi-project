package com.sishuok.jiangzh.archi.designs.visitor.impl;

// 原始对象
public abstract class Element {

    public abstract void accept(Visitor visitor);

}
