package com.sishuok.jiangzh.archi.designs.builder.impl;

public class ConcreteBuilder implements Builder{

    // 持有产品组件
    private Product resultProduct;

    public Product getResult(){
        return resultProduct;
    }

    @Override
    public void buildPart() {
        // 某个组件的功能处理
    }
}
