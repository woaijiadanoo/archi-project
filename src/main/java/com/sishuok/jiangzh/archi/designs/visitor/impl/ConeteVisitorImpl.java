package com.sishuok.jiangzh.archi.designs.visitor.impl;

public class ConeteVisitorImpl implements Visitor{
    @Override
    public void visioConeteElementA(ConeteElementA coneteElementA) {
        coneteElementA.opertionA();
    }

    @Override
    public void visioConeteElementB(ConeteElementB coneteElementB) {
        coneteElementB.opertionB();
    }
}
