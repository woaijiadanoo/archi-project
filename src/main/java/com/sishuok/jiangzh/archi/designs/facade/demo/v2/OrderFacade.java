package com.sishuok.jiangzh.archi.designs.facade.demo.v2;

import com.sishuok.jiangzh.archi.designs.facade.demo.FacadeOrderService;
import com.sishuok.jiangzh.archi.designs.facade.demo.FacadeOrderServiceImpl;

public class OrderFacade {

    private FacadeOrderService service = null;


    public void setService(FacadeOrderService service) {
        this.service = service;
    }

    public void order(String cookieDetails){
        service.confirmOrder(cookieDetails);
        service.cookie(cookieDetails);
    }

    public void payment(double price,int deskNum){
        service.payment(price);
        service.clean(deskNum);
    }

}
