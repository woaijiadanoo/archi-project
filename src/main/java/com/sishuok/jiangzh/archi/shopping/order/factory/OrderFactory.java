package com.sishuok.jiangzh.archi.shopping.order.factory;


import com.sishuok.jiangzh.archi.shopping.order.service.OrderServiceAPI;
import com.sishuok.jiangzh.archi.shopping.order.service.OrderServiceImpl;

public class OrderFactory {

    public static OrderServiceAPI createInstance(){
        return new OrderServiceImpl();
    }

}
