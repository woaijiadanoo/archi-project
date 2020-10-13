package com.sishuok.jiangzh.archi.designs.command.impl;

public class CommandClient {

    public static void main(String[] args) {
        Invoker invoker = init();

        invoker.runCommand();
    }

    private static Invoker init(){
        Receiver receiver = new Receiver();

        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        return invoker;
    }

}
