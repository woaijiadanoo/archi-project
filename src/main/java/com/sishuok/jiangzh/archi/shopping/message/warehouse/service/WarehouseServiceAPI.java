package com.sishuok.jiangzh.archi.shopping.message.warehouse.service;

import java.util.List;

public interface WarehouseServiceAPI {

    // 仓储模块对订单模块通讯回复电文,心跳电文
    boolean connectionOrder(String houseId);
    // 仓储模块对订单模块申请订单号
    String applyOrderId(String houseId);
    // 仓储模块对订单模块请求发货计划
    String applyPlan(String houseId, List<String> detailOrderIds);
    // 仓储模块反馈发货计划
    boolean deliveryPlan(String houseId, List<String> detailOrderIds);
    // 仓储模块对订单返回拒绝的申请
    void unSuccessPlan(String houseId, List<String> detailOrderIds);
    // 仓储模块对发货的订单进行反馈
    void successPlan(String houseId, List<String> detailOrderIds);

}
