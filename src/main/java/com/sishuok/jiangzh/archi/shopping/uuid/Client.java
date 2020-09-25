package com.sishuok.jiangzh.archi.shopping.uuid;

import com.sishuok.jiangzh.archi.shopping.uuid.bridge.UUIDDAOEnum;
import com.sishuok.jiangzh.archi.shopping.uuid.service.UUIDService;
import com.sishuok.jiangzh.archi.shopping.uuid.service.UUIDServiceImpl;
import com.sishuok.jiangzh.archi.shopping.uuid.service.bo.FormatModel;
import com.sishuok.jiangzh.archi.shopping.uuid.service.factory.UUIDServiceFactory;

public class Client {

    public static void main(String[] args) {
        step2();
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
