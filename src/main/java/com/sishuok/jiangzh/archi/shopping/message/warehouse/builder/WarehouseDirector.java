package com.sishuok.jiangzh.archi.shopping.message.warehouse.builder;

import com.sishuok.jiangzh.archi.shopping.message.warehouse.enums.WarehouseMsgTypeEnum;

public class WarehouseDirector {

    private WarehouseBuilder warehouseBuilder;
    public WarehouseDirector(WarehouseBuilder warehouseBuilder){
        this.warehouseBuilder = warehouseBuilder;
    }

    // HO001-house01
    public String constructHO1(String houseId){
        return warehouseBuilder.getMessageType(WarehouseMsgTypeEnum.HO001.name()).getHouseId(houseId).getMessage();
    }


}
