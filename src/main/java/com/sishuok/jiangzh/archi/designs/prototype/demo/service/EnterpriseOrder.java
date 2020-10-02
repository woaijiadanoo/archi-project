package com.sishuok.jiangzh.archi.designs.prototype.demo.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class EnterpriseOrder implements PrototypeOrderAPI{

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
}
