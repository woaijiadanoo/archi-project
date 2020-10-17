package com.sishuok.jiangzh.archi.shopping.message.order.state;

public class OH1StateImpl implements OrderMessageState{
    @Override
    public String requestHandler(OrderMessageContext context) {
        return "OH001-"+context.getWarehouseId();
    }
}
