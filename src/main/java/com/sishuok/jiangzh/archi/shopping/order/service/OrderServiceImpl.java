package com.sishuok.jiangzh.archi.shopping.order.service;

import com.sishuok.jiangzh.archi.shopping.Mediator;
import com.sishuok.jiangzh.archi.shopping.order.vo.GoodsModel;
import com.sishuok.jiangzh.archi.shopping.order.vo.OrderModel;
import com.sishuok.jiangzh.archi.shopping.warehouse.factory.WarehouseFactory;
import com.sishuok.jiangzh.archi.shopping.warehouse.service.WarehouseServiceAPI;

public class OrderServiceImpl implements OrderServiceAPI{

    private WarehouseServiceAPI warehouseServiceAPI = WarehouseFactory.createInstance();

    private Mediator mediator = Mediator.getMediator();

    /*
        不适合中介者模式介入
     */
    @Override
    public boolean checkOrder(OrderModel orderModel) {
        // 基础信息验证： 订单编号是否合法， 商品数量是否超限
        // 风控
        // 与库存交互，看商品数量是否足够
        for(GoodsModel goodsModel : orderModel.getGoodsModels()){
            // 1、一个不满足整单打回
            // 2、其他满足的继续，不满足反馈用户
            warehouseServiceAPI.goodsExists(goodsModel);
        }

        // ...
        return true;
    }

    /*
        1、下单
        2、拆单 -> 生鲜、 鲜花、 饮品 -> 订单状态改变
        3、拆单完成以后 -> 订单状态改变
        4、发货 -> 订单状态改变
        -> 流程理论上可以无限扩展
        -> 适合中介者模式介入的
     */
    @Override
    public void order(OrderModel orderModel) {
        // 1、下单 -> 检查成功了
        mediator.mainOrder(orderModel);
    }

    /* TODO 作业
        忽略： 特殊商品不允许退货
        1、区分订单所处于的环节-> 仓库派单， 物流配送， 快递配送， 七天无理由退款
        2、订单退货涉及的范围
            -> 深圳运送一朵花至北京【前提，这朵花只能在深圳长期保存，北京只能开两天】
            -> 在运送途中【天津】， 用户退货
            -> 物流查看附近是否有返回深圳的物流配送车
            -> 仓库查看到深圳时间，并安排检查
            -> 检查成功，则安排入库

        -> 是否适合中介者模式？  对，适合
     */
    @Override
    public void back(int orderId) {

    }
}
