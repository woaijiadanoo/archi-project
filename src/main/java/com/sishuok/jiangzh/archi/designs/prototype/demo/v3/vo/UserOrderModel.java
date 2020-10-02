package com.sishuok.jiangzh.archi.designs.prototype.demo.v3.vo;

import com.sishuok.jiangzh.archi.designs.prototype.demo.service.UserOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserOrderModel {

    private String userName;
    private ProducetOrderModel product;
    private int orderNum;

    public UserOrderModel(UserOrderModel uom){
        this.userName = uom.getUserName();
        this.orderNum = uom.getOrderNum();
        // 深度克隆
        this.setProduct(uom.getProduct().clone());
    }

    public UserOrderModel clone(){
        UserOrderModel uom = new UserOrderModel(this);
        return uom;
    }
}
