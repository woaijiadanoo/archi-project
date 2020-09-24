package com.sishuok.jiangzh.archi.shopping.uuid;

import com.sishuok.jiangzh.archi.shopping.uuid.bridge.UUIDDAOEnum;
import com.sishuok.jiangzh.archi.shopping.uuid.service.UUIDService;
import com.sishuok.jiangzh.archi.shopping.uuid.service.UUIDServiceImpl;

public class Client {

    public static void main(String[] args) {
        String businessType = "order";
        UUIDServiceImpl uuidService = new UUIDServiceImpl(UUIDDAOEnum.DB);

        String u1 = uuidService.getUuid(businessType);
        System.out.println("order uuid = " + u1);

        String u2 = uuidService.getUuid(businessType);
        System.out.println("order uuid = " + u2);
    }

}
