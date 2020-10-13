package com.sishuok.jiangzh.archi.designs.command.demo.v2;

import java.util.List;

public class OrderSystemInvokerV2 {

    private WaiterCommand command;

    public void setCommand(WaiterCommand command) {
        this.command = command;
    }

    public void order(List<String> infos){
        command.order(infos);
    }

    public void pay(double price){
        // TODO 具体的支付命令接收对象
    }

}
