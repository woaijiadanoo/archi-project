package com.sishuok.jiangzh.archi.shopping.uuid.service.factory;

import com.sishuok.jiangzh.archi.shopping.uuid.service.UUIDService;
import com.sishuok.jiangzh.archi.shopping.uuid.service.UUIDStrategyServiceImpl;

public class UUIDServiceFactory {

    private UUIDServiceFactory(){};

    private static UUIDService service = new UUIDStrategyServiceImpl();

    public static UUIDService getUUIDService(){
        return service;
    }

}
