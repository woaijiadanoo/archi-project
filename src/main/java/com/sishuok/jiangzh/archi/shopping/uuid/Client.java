package com.sishuok.jiangzh.archi.shopping.uuid;

import com.sishuok.jiangzh.archi.shopping.uuid.adapter.UUIDServiceAdapter;
import com.sishuok.jiangzh.archi.shopping.uuid.bridge.UUIDDAOEnum;
import com.sishuok.jiangzh.archi.shopping.uuid.service.UUIDService;
import com.sishuok.jiangzh.archi.shopping.uuid.service.UUIDServiceImpl;
import com.sishuok.jiangzh.archi.shopping.uuid.service.bo.FormatModel;
import com.sishuok.jiangzh.archi.shopping.uuid.service.factory.UUIDServiceFactory;

public class Client {

    public static void main(String[] args) {
        // 第一版-生成唯一表示
//        step1();
        // 第二版-加入策略模式
//        step2();
        // 第三版-加入适配器模式
//        step31(); // 适配第一版接口
        step32(); // 适配第二版接口

    }

    private static void step31(){
        String businessType = "order";
        // 组织Adapter
        UUIDService uuidService = new UUIDServiceAdapter();

        String u1 = uuidService.getUuid(businessType);
        System.out.println("order uuid = " + u1);

        String u2 = uuidService.getUuid(businessType);
        System.out.println("order uuid = " + u2);
    }

    private static void step32(){
        String businessType = "order";
        UUIDService uuidService = new UUIDServiceAdapter();

        FormatModel formatModel = new FormatModel(true,"商城第#订单","a",5);

        String u1 = uuidService.getUuid(businessType, formatModel, true, null);
        System.out.println("order uuid = " + u1);

        String u2 = uuidService.getUuid(businessType, formatModel, true, null);
        System.out.println("order uuid = " + u2);

        uuidService.getUuid("warehouse", formatModel, true, null);

        for(int i=0;i<8;i++){
            uuidService.getUuid(businessType, formatModel, true, null);
        }

    }

    private static void step2(){
        String businessType = "order";
        UUIDService uuidService = UUIDServiceFactory.getUUIDService();

        FormatModel formatModel = new FormatModel(true,"商城第#订单","a",5);

        String u1 = uuidService.getUuid(businessType, formatModel, true, null);
        System.out.println("order uuid = " + u1);

        String u2 = uuidService.getUuid(businessType, formatModel, true, null);
        System.out.println("order uuid = " + u2);
    }

    private static void step1(){
        String businessType = "order";
        UUIDServiceImpl uuidService = new UUIDServiceImpl(UUIDDAOEnum.DB);

        String u1 = uuidService.getUuid(businessType);
        System.out.println("order uuid = " + u1);

        String u2 = uuidService.getUuid(businessType);
        System.out.println("order uuid = " + u2);
    }

}
