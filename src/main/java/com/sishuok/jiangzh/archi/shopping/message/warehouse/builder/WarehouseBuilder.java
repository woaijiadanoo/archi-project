package com.sishuok.jiangzh.archi.shopping.message.warehouse.builder;

public interface WarehouseBuilder {

    // HO005-houseId, order3|order1|order2
    String getMessage();

    WarehouseBuilder getMessageType(String type);
    WarehouseBuilder getHouseId(String houseId);

    WarehouseBuilder getComma();
    WarehouseBuilder getOrderId(String orderId);
    WarehouseBuilder getConnector();

}
