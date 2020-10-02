package com.sishuok.jiangzh.archi.designs.prototype.impl;

public class Client {

    public static void main(String[] args) {
        Prototype prototype = new ConctetePrototypeA();

        Prototype clone = prototype.clone();

    }

}
