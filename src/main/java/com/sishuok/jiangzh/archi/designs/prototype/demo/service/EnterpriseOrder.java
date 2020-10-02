package com.sishuok.jiangzh.archi.designs.prototype.demo.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class EnterpriseOrder implements PrototypeOrderAPI,Cloneable{

    private String enterpriseName;
    private String producerId;
    private int enterpriceOrderNum;

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProducerId() {
        return producerId;
    }

    public void setProducerId(String producerId) {
        this.producerId = producerId;
    }

    @Override
    public void setOrderNum(int orderNum) {
        this.enterpriceOrderNum = orderNum;
    }

    @Override
    public int getOrderNum() {
        return this.enterpriceOrderNum;
    }

    @Override
    public PrototypeOrderAPI clone() {
        PrototypeOrderAPI orderAPI =
                new EnterpriseOrder(this.enterpriseName,this.producerId,this.enterpriceOrderNum);
        return orderAPI;
    }

    /*
        Java自带的clone方法实现
     */
    public Object javaClone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }

    @Override
    public String toString() {
        return "EnterpriseOrder{" +
                "enterpriseName='" + enterpriseName + '\'' +
                ", producerId='" + producerId + '\'' +
                ", enterpriceOrderNum=" + enterpriceOrderNum +
                '}';
    }
}
