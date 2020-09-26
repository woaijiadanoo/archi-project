package com.sishuok.jiangzh.archi.shopping.uuid.monitor.factory;

import com.sishuok.jiangzh.archi.shopping.uuid.monitor.UUIDServiceMonitorAPI;
import com.sishuok.jiangzh.archi.shopping.uuid.monitor.UUIDServiceMonitorImpl;
import com.sishuok.jiangzh.archi.shopping.uuid.monitor.observers.ServerPrintObserver;
import com.sishuok.jiangzh.archi.shopping.uuid.monitor.observers.ServerStopObserver;

public class UUIDServiceMonitorFactory {

    private UUIDServiceMonitorFactory(){};

    private static UUIDServiceMonitorImpl serviceMonitor = new UUIDServiceMonitorImpl();

    public static UUIDServiceMonitorAPI createMonitorAPI(){
        // 注册所有的观察者
        serviceMonitor.addObserver(new ServerStopObserver());
        serviceMonitor.addObserver(new ServerPrintObserver());
        // 暂时返回
        return serviceMonitor;
    }

}
