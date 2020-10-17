package com.sishuok.jiangzh.archi.shopping.message.order.command;

import com.sishuok.jiangzh.archi.shopping.message.order.state.OrderMessageContext;

public class OrderMessageCommandImpl implements OrderMessageCommand{

    private OrderMessageRecevice recevice;

    public OrderMessageCommandImpl(OrderMessageRecevice recevice){
        this.recevice = recevice;
    }

    @Override
    public String execute(OrderMessageContext context) {
        return recevice.action(context);
    }
}
