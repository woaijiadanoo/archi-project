package com.sishuok.jiangzh.archi.shopping.message.order.state;

import java.util.ArrayList;
import java.util.List;

public class OrderMessageContext {

    // warehouse传入的报文信息
    private String requestMessage;

    // order返回的报文信息
    private String responseMessage;

    private String messageType;
    private String warehouseId;
    private List<String> orderIds;

    /*
        HO001-warehouseId                             OH001-warehouseId
        HO002-warehouseId                             OH002-warehouseId
        HO003-warehouseId                             OH003-warehouseId
        HO004-warehouseId,order3|order1|order2        OH004-warehouseId,order3|order1|order2
        HO005-warehouseId,order3|order1|order2        OH005-warehouseId,order3|order2|order1
        HO006-warehouseId,order3|order1|order2        // 花开两朵，各表一枝
        HO007-warehouseId,order3|order1|order2
     */
    public String contextRequest(String requestMessage){
        // 初始化数据
        getType(requestMessage);

        // 业务处理
        if(messageType.equals("HO001")){
            return new OH1StateImpl().requestHandler(this);
        }else if(messageType.equals("HO004")){
            return new OH4StateImpl().requestHandler(this);
        }

        return "";
    }

    private void getType(String requestMessage){
        // TODO ，处理请求入参的message，分别对应不同的状态处理
        String[] requestMessageSpilt = requestMessage.split("-");
        String[] details = requestMessageSpilt[1].split(",");
        messageType = requestMessageSpilt[0];  // HO004
        warehouseId = details[0];
        orderIds = new ArrayList<>();
        if(details.length > 1){
            String[] orders = details[1].split("\\|");
            for(String order : orders){
                orderIds.add(order);
            }
        }
    }

    public String getRequestMessage() {
        return requestMessage;
    }

    public String getMessageType() {
        return messageType;
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public List<String> getOrderIds() {
        return orderIds;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
