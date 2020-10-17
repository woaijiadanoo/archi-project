package com.sishuok.jiangzh.archi.shopping.message.order.state;

import com.sishuok.jiangzh.archi.shopping.message.order.command.OrderMessageCommand;
import com.sishuok.jiangzh.archi.shopping.message.order.command.OrderMessageCommandImpl;
import com.sishuok.jiangzh.archi.shopping.message.order.command.OrderMessageInvoker;
import com.sishuok.jiangzh.archi.shopping.message.order.command.OrderMessageRecevice;

import java.util.List;

public class OH3StateImpl implements OrderMessageState{
    // OH004-warehouseId,order3|order1|order2
    @Override
    public String requestHandler(OrderMessageContext context) {

        OrderMessageInvoker invoker = initCommand();

        String result = invoker.runCommand(context);
        System.out.println("应该拼写在具体报文体中，让仓储模块知道 result = " + result);

        String warehouseId = context.getWarehouseId();
        return "OH003-"+warehouseId;
    }

    private OrderMessageInvoker initCommand(){
        OrderMessageRecevice recevice = null;
        OrderMessageCommand command = new OrderMessageCommandImpl(recevice);

        OrderMessageInvoker invoker = new OrderMessageInvoker();
        invoker.setCommand(command);

        return invoker;
    }

}
