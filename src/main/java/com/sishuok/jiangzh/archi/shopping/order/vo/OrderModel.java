package com.sishuok.jiangzh.archi.shopping.order.vo;

import lombok.Data;

import java.util.List;

@Data
public class OrderModel {

    private int orderId;
    private int orderStatus;  // 不用枚举了，0-下单成功，1-待拆单，2-拆单成功，3-发货成功
    private List<GoodsModel> goodsModels;

}
