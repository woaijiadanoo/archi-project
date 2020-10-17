package com.sishuok.jiangzh.archi.shopping.message.order.command;

import com.sishuok.jiangzh.archi.shopping.message.order.state.OrderMessageContext;

public interface OrderMessageCommand {

    String execute(OrderMessageContext context);

}
