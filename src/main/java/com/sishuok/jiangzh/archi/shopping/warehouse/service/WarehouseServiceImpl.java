package com.sishuok.jiangzh.archi.shopping.warehouse.service;

import com.sishuok.jiangzh.archi.shopping.Mediator;
import com.sishuok.jiangzh.archi.shopping.order.vo.GoodsModel;
import com.sishuok.jiangzh.archi.shopping.order.vo.OrderModel;

public class WarehouseServiceImpl implements WarehouseServiceAPI{

    private Mediator mediator = Mediator.getMediator();

    @Override
    public boolean goodsExists(GoodsModel goodsModel) {
        return true;
    }

    // 拆单
    @Override
    public void prepareOrder(OrderModel orderModel) {
        // TODO 拆单动作都做完了
        orderModel.setOrderStatus(2);
        // 通知中介者进行下一步操作
        mediator.mainOrder(orderModel);
    }
}
