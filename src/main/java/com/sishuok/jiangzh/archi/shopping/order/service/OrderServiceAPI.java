package com.sishuok.jiangzh.archi.shopping.order.service;

import com.sishuok.jiangzh.archi.shopping.order.vo.OrderModel;

public interface OrderServiceAPI {

    // 有效性校验
    boolean checkOrder(OrderModel orderModel);

    // 下单 -> 分单[分配给各个仓库进行备货]
    void order(OrderModel orderModel);

    // 退货流程
    void back(int orderId);

}
