package com.sishuok.jiangzh.archi.shopping.warehouse.service;

import com.sishuok.jiangzh.archi.shopping.order.vo.GoodsModel;
import com.sishuok.jiangzh.archi.shopping.order.vo.OrderModel;

public interface WarehouseServiceAPI {

    boolean goodsExists(GoodsModel goodsModel);

    void prepareOrder(OrderModel orderModel);
}
