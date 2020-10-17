package com.sishuok.jiangzh.archi.shopping.message.warehouse;

import com.sishuok.jiangzh.archi.shopping.message.warehouse.service.WarehouseServiceAPI;
import com.sishuok.jiangzh.archi.shopping.message.warehouse.service.WarehouseServiceImpl;

import java.util.Arrays;
import java.util.List;

public class WarehouseTest {

    private static WarehouseServiceAPI api = new WarehouseServiceImpl();

    public static void main(String[] args) {
        String houseId = "house01";
//        connectionOrderTest(houseId);
//        connectionOrderTest(houseId);
//        connectionOrderTest(houseId);
//        connectionOrderTest(houseId);

        List<String> ids = Arrays.asList("03","01","02");

        ho004(houseId, ids);
    }

    public static void connectionOrderTest(String houseId){
        System.out.println("connectionOrder ："+api.connectionOrder(houseId));
    }

    public static void ho004(String houseId, List<String> orderIds){
        System.out.println("ho004 ："+api.applyPlan(houseId,orderIds));
    }

}
