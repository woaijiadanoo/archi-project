package com.sishuok.jiangzh.archi.shopping;

import com.sishuok.jiangzh.archi.shopping.finance.factory.FinanceFactory;
import com.sishuok.jiangzh.archi.shopping.finance.service.FinanceServiceAPI;
import com.sishuok.jiangzh.archi.shopping.order.factory.OrderFactory;
import com.sishuok.jiangzh.archi.shopping.order.service.OrderServiceAPI;
import com.sishuok.jiangzh.archi.shopping.order.vo.OrderModel;
import com.sishuok.jiangzh.archi.shopping.warehouse.factory.WarehouseFactory;
import com.sishuok.jiangzh.archi.shopping.warehouse.service.WarehouseServiceAPI;

public class Mediator {

    private OrderServiceAPI orderServiceAPI;
    private WarehouseServiceAPI warehouseServiceAPI;
    private FinanceServiceAPI financeServiceAPI;

    private static Mediator mediator = new Mediator();

    public Mediator(){}

    public static Mediator getMediator(){
        return mediator;
    }

    public void init(){
        orderServiceAPI = OrderFactory.createInstance();
        warehouseServiceAPI = WarehouseFactory.createInstance();
        financeServiceAPI = FinanceFactory.createInstance();
    }

    /*
        主订单流程
     */
    public void mainOrder(OrderModel orderModel){
        /*
        1、下单
        2、拆单 -> 生鲜、 鲜花、 饮品 -> 订单状态改变
        3、拆单完成以后 -> 订单状态改变
        4、发货 -> 订单状态改变
        -> 流程理论上可以无限扩展
        -> 适合中介者模式介入的
     */
        // 不用枚举了，0-下单成功，1-待拆单，2-拆单成功，3-发货成功
        // 流程理论上可以无限扩展 -> 相当于在这里解决了
        if(orderModel.getOrderStatus() == 0){
            orderModel.setOrderStatus(1);
            // 拆单
            warehouseServiceAPI.prepareOrder(orderModel);
        }else if(orderModel.getOrderStatus() == 2){
            // 调用order类中的主订单流程，让流程继续向下走
        }else if(orderModel.getOrderStatus() == 3){
            // 调用order类中的主订单流程，让流程继续向下走
        }else if(orderModel.getOrderStatus() == 4){
            // 调用order类中的主订单流程，让流程继续向下走
        }
    }

}
