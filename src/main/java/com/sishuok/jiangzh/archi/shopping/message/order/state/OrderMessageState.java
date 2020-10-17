package com.sishuok.jiangzh.archi.shopping.message.order.state;

public interface OrderMessageState {

    /*
        HO001-warehouseId                             OH001-warehouseId
        HO002-warehouseId                             OH002-warehouseId
        HO003-warehouseId                             OH003-warehouseId
        HO004-warehouseId,order3|order1|order2        OH004-warehouseId,order3|order1|order2
        HO005-warehouseId,order3|order1|order2        OH005-warehouseId,order3|order2|order1
        HO006-warehouseId,order3|order1|order2        // 花开两朵，各表一枝
        HO007-warehouseId,order3|order1|order2
     */
    String requestHandler(OrderMessageContext context);

}
