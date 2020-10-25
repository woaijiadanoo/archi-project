package com.sishuok.jiangzh.archi.designs.facade.demo;

public class FacadeOrderServiceImpl implements FacadeOrderService {
    @Override
    public void confirmOrder(String cookDetails) {
        System.out.println("confirmOrder cookDetails = " + cookDetails);
    }

    @Override
    public void cookie(String cookDetails) {
        System.out.println("cookie cookDetails = " + cookDetails);
    }

    @Override
    public void payment(double price) {
        System.out.println("payment price = " + price);
    }

    @Override
    public void clean(int deskNum) {
        System.out.println("clean deskNum = " + deskNum);
    }
}
