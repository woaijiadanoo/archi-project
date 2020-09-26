package com.sishuok.jiangzh.archi.shopping.uuid.monitor;

import com.sishuok.jiangzh.archi.shopping.uuid.monitor.vo.MonitorModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class UUIDServiceMonitorImpl extends Observable implements UUIDServiceMonitorAPI{

    private static Map<String, Integer> businessNum = new HashMap<>();

    @Override
    public void addBusinessNum(String businessType) {
        Integer num = businessNum.get(businessType);
        if(num == null){
            // 初始化业务量
            businessNum.put(businessType, 1);
        }else{
            businessNum.put(businessType, num+1);
        }

        // 通知所有的观察者
        MonitorModel monitorModel = new MonitorModel(businessType,businessNum);

        this.setChanged();
        this.notifyObservers(monitorModel);

        // 为了展示效果而打印
        System.out.println("businessType : "+businessType+" , num : " + businessNum.get(businessType));
    }

}
