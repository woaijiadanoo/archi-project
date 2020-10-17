package com.sishuok.jiangzh.archi.shopping.message.order.command;

import com.sishuok.jiangzh.archi.shopping.message.order.state.OrderMessageContext;

public interface OrderMessageRecevice {

    String action(OrderMessageContext context);

}
