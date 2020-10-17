package com.sishuok.jiangzh.archi.shopping.message.order.command;

import com.sishuok.jiangzh.archi.shopping.message.order.state.OrderMessageContext;

public class OrderMessageInvoker {

    private OrderMessageCommand command;

    public void setCommand(OrderMessageCommand command) {
        this.command = command;
    }

    public String runCommand(OrderMessageContext context){
        return command.execute(context);
    }

}
