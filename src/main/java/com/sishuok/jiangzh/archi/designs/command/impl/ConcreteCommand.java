package com.sishuok.jiangzh.archi.designs.command.impl;

public class ConcreteCommand implements Command{

    // 具体的命令接收者对象
    private Receiver receiver = null;
    // 命令对象可以有自己的状态
    private String state;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
