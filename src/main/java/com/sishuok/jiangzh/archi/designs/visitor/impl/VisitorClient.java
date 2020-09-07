package com.sishuok.jiangzh.archi.designs.visitor.impl;

public class VisitorClient {

    public static void main(String[] args) {
        ObjectStruct objectStruct = new ObjectStruct();

        ConeteElementA coneteElementA = new ConeteElementA();
        ConeteElementB coneteElementB = new ConeteElementB();

        objectStruct.addElement(coneteElementA);
        objectStruct.addElement(coneteElementB);

        // 具体增加的访问者内容
        Visitor visitor = new ConeteVisitorImpl();
        // 传入对应的visitor进行访问操作
        objectStruct.operation(visitor);
    }

}
