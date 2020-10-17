package com.sishuok.jiangzh.archi.shopping.message.order.state;

import java.util.Arrays;
import java.util.List;

public class OH4StateImpl implements OrderMessageState{
    // OH004-warehouseId,order3|order1|order2
    @Override
    public String requestHandler(OrderMessageContext context) {
        String warehouseId = context.getWarehouseId();
        String ids = orderIds(context.getOrderIds());
        System.out.println("warehouseId : "+warehouseId+" , ids = " + ids);
        return "OH004-"+warehouseId+","+ids;
    }

    private String orderIds(List<String> orderIds){
        String result = "";
        StringBuffer sb = new StringBuffer();
        for(String orderId : orderIds){
            sb.append(orderId);
            sb.append("|");
        }

        result = sb.toString();
        // 去除最后一个连接符
        result = result.substring(0, result.length()-1);

        return result;
    }
}
