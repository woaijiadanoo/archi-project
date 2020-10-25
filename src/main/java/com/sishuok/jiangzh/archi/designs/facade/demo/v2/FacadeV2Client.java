package com.sishuok.jiangzh.archi.designs.facade.demo.v2;

import com.sishuok.jiangzh.archi.designs.facade.demo.FacadeOrderService;
import com.sishuok.jiangzh.archi.designs.facade.demo.FacadeOrderServiceImpl;
import com.sishuok.jiangzh.archi.designs.facade.impl.Facade;

public class FacadeV2Client {

    public static void main(String[] args) {
        OrderFacade init = init();
        String cookieDetails = "地三鲜，宫保鸡丁...";
        int deskNum = 12;
        double price = 128.32;

        // 下单
        init.order(cookieDetails);
        // 结账
        init.payment(price,deskNum);
    }

    public static OrderFacade init(){
        FacadeOrderService service = new FacadeOrderServiceImpl();
        OrderFacade facade = new OrderFacade();
        facade.setService(service);

        return facade;
    }

}
