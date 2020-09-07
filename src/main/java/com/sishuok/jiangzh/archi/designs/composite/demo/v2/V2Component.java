package com.sishuok.jiangzh.archi.designs.composite.demo.v2;

/*
    组合模式带来的思考
        1、component只实现Leaf的相关功能，或者公共功能
        2、component注重透明性而非安全性，因为他把所有的功能都集中在了父类中，会出现调用异常，所以需要额外解决
 */
public abstract class V2Component {

    protected String name;

    public V2Component(String name){
        this.name = name;
    }

    public abstract void printStruct(String preName);

    public void addChild(V2Component component){
        throw new UnsupportedOperationException("对象不支持此方法");
    }

}
