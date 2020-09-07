package com.sishuok.jiangzh.archi.designs.visitor.impl;

public class VisitorClient {

    /*
        1、 业务类要实现accept方法，并回调visitor [这个visitor是个接口，想干什么都取决于Visio的实现类]
        2、 visitor持有所有的Element实现类，可以获取所有的公共内容
        3、 visitor可以随时添加功能
        4、 ObjectStruct提供Element集合，并且批量注入visitor，使得调用可以批量执行
     */

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
