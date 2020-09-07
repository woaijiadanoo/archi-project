package com.sishuok.jiangzh.archi.designs.visitor.impl;

public class ConeteElementB extends Element{

    public void opertionB(){
        System.out.println("this is ConeteElementB");
    }

    /*
        相当于将自己本身传递给了visitor【全心全意付出】
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visioConeteElementB(this);
    }
}
