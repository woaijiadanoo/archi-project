package com.sishuok.jiangzh.archi.designs.builder.impl;

public class Director {

    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    // 实际构建最终组件的地方
    public void construct(){
        builder.buildPart();
    }

}
