package com.sishuok.jiangzh.archi.shopping.message.warehouse.builder;

public class WarehouseBuilderImpl implements WarehouseBuilder{

    private StringBuffer sb = new StringBuffer();

    @Override
    public String getMessage() {
        return sb.toString();
    }
    // HO001-house01,order3|order1|order2
    @Override
    public WarehouseBuilder getMessageType(String type) {
        sb.append(type+"-");
        return this;
    }

    @Override
    public WarehouseBuilder getHouseId(String houseId) {
        sb.append(houseId);
        return this;
    }

    @Override
    public WarehouseBuilder getComma() {
        sb.append(",");
        return this;
    }

    @Override
    public WarehouseBuilder getOrderId(String orderId) {
        sb.append(orderId);
        return this;
    }

    @Override
    public WarehouseBuilder getConnector() {
        sb.append("|");
        return this;
    }
}
