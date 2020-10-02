package com.sishuok.jiangzh.archi.designs.prototype.demo.v3.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProducetOrderModel {

    private String productId;
    private String productName;

    public ProducetOrderModel clone(){
        ProducetOrderModel producetOrderModel = new ProducetOrderModel();
        producetOrderModel.setProductId(this.productId);
        producetOrderModel.setProductName(this.productName);

        return producetOrderModel;
    }

}
