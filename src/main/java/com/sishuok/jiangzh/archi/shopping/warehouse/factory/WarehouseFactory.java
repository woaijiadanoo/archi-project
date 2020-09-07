package com.sishuok.jiangzh.archi.shopping.warehouse.factory;


import com.sishuok.jiangzh.archi.shopping.warehouse.service.WarehouseServiceAPI;
import com.sishuok.jiangzh.archi.shopping.warehouse.service.WarehouseServiceImpl;

public class WarehouseFactory {

    public static WarehouseServiceAPI createInstance(){
        return new WarehouseServiceImpl();
    }

}
