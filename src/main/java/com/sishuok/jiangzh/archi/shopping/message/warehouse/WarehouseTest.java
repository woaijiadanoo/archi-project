package com.sishuok.jiangzh.archi.shopping.message.warehouse;

import com.sishuok.jiangzh.archi.shopping.message.warehouse.service.WarehouseServiceAPI;
import com.sishuok.jiangzh.archi.shopping.message.warehouse.service.WarehouseServiceImpl;

public class WarehouseTest {

    private static WarehouseServiceAPI api = new WarehouseServiceImpl();

    public static void main(String[] args) {
        String houseId = "house01";
        connectionOrderTest(houseId);
        connectionOrderTest(houseId);
        connectionOrderTest(houseId);
        connectionOrderTest(houseId);
    }

    public static void connectionOrderTest(String houseId){
        System.out.println("connectionOrder ："+api.connectionOrder(houseId));
    }

}
