package com.sishuok.jiangzh.archi.designs.prototype.demo.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class UserOrder implements PrototypeOrderAPI{

    private String userName;
    private String producerId;
    private int userOrderNum;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProducerId() {
        return producerId;
    }

    public void setProducerId(String producerId) {
        this.producerId = producerId;
    }

    @Override
    public void setOrderNum(int orderNum) {
        this.userOrderNum = orderNum;
    }

    @Override
    public int getOrderNum() {
        return userOrderNum;
    }

    public UserOrder(UserOrder userOrder){
        this.userName = userOrder.getUserName();
        this.producerId = userOrder.getProducerId();
        this.userOrderNum = userOrder.getOrderNum();
    }

    @Override
    public PrototypeOrderAPI clone() {
        // 原型模式， 要把所有的属性尽量都拷贝下来
        PrototypeOrderAPI orderAPI = new UserOrder(this);
        return orderAPI;
    }
}
