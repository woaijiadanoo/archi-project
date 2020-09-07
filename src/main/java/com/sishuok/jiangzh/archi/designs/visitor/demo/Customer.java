package com.sishuok.jiangzh.archi.designs.visitor.demo;

public abstract class Customer {

    protected String name;

    public Customer(String name){
        this.name = name;
    }

    public abstract void hotLine(String message);

    // 这种形式的修改是不友好的
    public abstract void analyze();

}
