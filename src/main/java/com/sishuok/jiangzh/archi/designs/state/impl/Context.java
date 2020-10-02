package com.sishuok.jiangzh.archi.designs.state.impl;

public class Context {

    private State state;

    public void request(String sampleParameter){
        state = new ConcreteStateA();

        state.handler(sampleParameter);
    }

}
