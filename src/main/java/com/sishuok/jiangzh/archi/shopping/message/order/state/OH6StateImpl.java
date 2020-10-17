package com.sishuok.jiangzh.archi.shopping.message.order.state;

import com.sishuok.jiangzh.archi.shopping.message.order.chain.ManagerMessageHandler;
import com.sishuok.jiangzh.archi.shopping.message.order.chain.RDMessageHandler;

import java.util.List;

public class OH6StateImpl implements OrderMessageState{
    // OH004-warehouseId,order3|order1|order2
    @Override
    public String requestHandler(OrderMessageContext context) {
        // 触发异常处理流程， 组织对应的职责链进行处理
        RDMessageHandler rdMessageHandler = new RDMessageHandler();
        ManagerMessageHandler managerMessageHandler = new ManagerMessageHandler();
        rdMessageHandler.setSuccessor(managerMessageHandler);

        // 具体的职责链触发流程
        rdMessageHandler.handleRequest(context);

        return "OH006-"+context.getWarehouseId()+","+orderIds(context.getOrderIds());
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
