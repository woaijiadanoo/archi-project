package com.sishuok.jiangzh.archi.designs.prototype.impl;

public class ConctetePrototypeA implements Prototype{
    @Override
    public Prototype clone() {

        Prototype prototype = new ConctetePrototypeA();

        return prototype;
    }
}
