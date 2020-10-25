package com.sishuok.jiangzh.archi.designs.facade.demo;

public interface FacadeOrderService {

    void confirmOrder(String cookDetails);

    void cookie(String cookDetails);

    void payment(double price);

    void clean(int deskNum);
}
