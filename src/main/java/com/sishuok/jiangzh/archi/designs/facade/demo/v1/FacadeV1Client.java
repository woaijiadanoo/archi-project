package com.sishuok.jiangzh.archi.designs.facade.demo.v1;

import com.sishuok.jiangzh.archi.designs.facade.demo.FacadeOrderService;
import com.sishuok.jiangzh.archi.designs.facade.demo.FacadeOrderServiceImpl;

public class FacadeV1Client {

    public static void main(String[] args) {

        FacadeOrderService service = new FacadeOrderServiceImpl();

        String cookieDetails = "地三鲜，宫保鸡丁...";
        int deskNum = 12;
        double price = 128.32;

        // 下单
        service.confirmOrder(cookieDetails);
        service.cookie(cookieDetails);

        // 结账
        service.payment(price);
        service.clean(deskNum);
    }

}
