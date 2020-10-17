package com.sishuok.jiangzh.archi.shopping.message.order.chain;

import com.sishuok.jiangzh.archi.shopping.message.order.state.OrderMessageContext;

/*
    领导通知实现实现
 */
public class ManagerMessageHandler extends OrderMessageChainHanler{

    @Override
    public void handleRequest(OrderMessageContext context) {
        // TODO 处理自己的业务逻辑
    }
}
