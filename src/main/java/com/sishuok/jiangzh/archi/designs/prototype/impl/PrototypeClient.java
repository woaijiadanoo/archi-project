package com.sishuok.jiangzh.archi.designs.prototype.impl;

public class PrototypeClient {

    private Prototype prototype;

    public PrototypeClient(Prototype prototype){
        this.prototype = prototype;
    }

    public void operation(){
        Prototype newPrototype = prototype.clone();
    }

}
