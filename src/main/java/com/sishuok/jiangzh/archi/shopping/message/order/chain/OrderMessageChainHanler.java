package com.sishuok.jiangzh.archi.shopping.message.order.chain;

import com.sishuok.jiangzh.archi.shopping.message.order.state.OrderMessageContext;

public abstract class OrderMessageChainHanler {

    protected OrderMessageChainHanler successor;

    public void setSuccessor(OrderMessageChainHanler successor){
        this.successor = successor;
    }

    public abstract void handleRequest(OrderMessageContext context);

}
