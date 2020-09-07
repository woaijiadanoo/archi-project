package com.sishuok.jiangzh.archi.designs.visitor.impl;

public class ConeteElementA extends Element {

    public void opertionA(){
        System.out.println("this is ConeteElementA");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visioConeteElementA(this);
    }
}
