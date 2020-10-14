package com.sishuok.jiangzh.archi.shopping.message.warehouse.builder;

public class WarehouseBuildFactory {

    public static WarehouseDirector createDirector(){
        return new WarehouseDirector(new WarehouseBuilderImpl());
    }

}
