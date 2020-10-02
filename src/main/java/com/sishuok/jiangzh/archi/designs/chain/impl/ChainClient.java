package com.sishuok.jiangzh.archi.designs.chain.impl;

public class ChainClient {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        handlerA.setSuccessor(handlerB);

        handlerA.handleRequest();

    }

}
