package com.sishuok.jiangzh.archi.designs.command.impl;

public class Invoker {

    // 持有命令对象
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    // 执行命令请求
    public void runCommand(){
        // 调用具体的命令对象来执行方法
        command.execute();
    }

}
