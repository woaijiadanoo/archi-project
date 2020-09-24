package com.sishuok.jiangzh.archi.shopping.uuid.vo;

import lombok.Data;

@Data
public class UUIDModel {

    public UUIDModel(String businessType, Integer uuid){
        this.businessType = businessType;
        this.uuid = uuid;
    }

    private String businessType;
    private Integer uuid;

}
