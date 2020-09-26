package com.sishuok.jiangzh.archi.shopping.uuid.monitor.factory;

import com.sishuok.jiangzh.archi.shopping.uuid.monitor.UUIDServiceMonitorAPI;
import com.sishuok.jiangzh.archi.shopping.uuid.monitor.UUIDServiceMonitorImpl;
import com.sishuok.jiangzh.archi.shopping.uuid.service.factory.UUIDServiceFactory;

public class UUIDServiceMonitorFactory {

    private UUIDServiceMonitorFactory(){};

    public static UUIDServiceMonitorAPI createMonitorAPI(){
        // 暂时返回
        return new UUIDServiceMonitorImpl();
    }

}
