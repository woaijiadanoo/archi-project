package com.sishuok.jiangzh.archi.designs.prototype.impl;

public class ConctetePrototypeB implements Prototype{
    @Override
    public Prototype clone() {

        Prototype prototype = new ConctetePrototypeB();

        return prototype;
    }
}
