package com.sishuok.jiangzh.archi.shopping.message.warehouse.service;

import com.sishuok.jiangzh.archi.shopping.message.warehouse.builder.WarehouseBuildFactory;
import com.sishuok.jiangzh.archi.shopping.message.warehouse.trans.client.WarehouseTransClient;
import org.springframework.util.StringUtils;

import java.util.List;

/*
    HO001-houseId
    HO002-houseId
    HO003-houseId
    HO004-houseId
    HO005-houseId, order3|order1|order2
    HO006-houseId, order3|order1|order2
    HO007-houseId, order3|order1|order2

 */

public class WarehouseServiceImpl implements WarehouseServiceAPI {

    // 订单模块消息Server的端口号
    private static int orderPort = 10086;

    private String sendMessage(String message){
        WarehouseTransClient client = new WarehouseTransClient(orderPort);
        String response = client.sendMessage(message);
        System.out.println("response = " + response);

        return response;
    }

    // 仓储模块对订单模块通讯回复电文,心跳电文
    @Override
    public boolean connectionOrder(String houseId) {
        // 组织报文 【HO001 : houseId】
        String message = WarehouseBuildFactory.createDirector().constructHO1(houseId);
        // 将报文发送至Order服务器，来看一下order是否存活
        String response = sendMessage(message);
        // 获取order的报文返回
        if(StringUtils.isEmpty(response)){
           return false;
        }
        // 检测心跳
        return true;
    }

    @Override
    public String applyOrderId(String houseId) {
        return null;
    }

    @Override
    public String applyPlan(String houseId, List<String> detailOrderIds) {
        return null;
    }

    @Override
    public boolean deliveryPlan(String houseId, List<String> detailOrderIds) {
        return false;
    }

    @Override
    public void unSuccessPlan(String houseId, List<String> detailOrderIds) {

    }

    @Override
    public void successPlan(String houseId, List<String> detailOrderIds) {

    }
}
