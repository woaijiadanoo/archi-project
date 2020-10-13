package com.sishuok.jiangzh.archi.designs.command.demo.v3;

import com.sishuok.jiangzh.archi.designs.command.demo.common.Command;
import com.sishuok.jiangzh.archi.designs.command.demo.v2.WaiterCommand;

public class OrderSystemInvokerV3 {

    private WaiterCommand command;
    private Command payCommand;

    public void setCommand(WaiterCommand command) {
        this.command = command;
    }

    public void setPayCommand(Command payCommand) {
        this.payCommand = payCommand;
    }

    public void order(CommandModel commandModel){
        if(commandModel.getCommandType() == 0){
            command.order(commandModel.getInfos());
        }
    }

    public void pay(CommandModel commandModel){
        // TODO 具体的支付命令接收对象
        if(commandModel.getCommandType() == 1){
            payCommand.execute(commandModel);
        }
    }

}
