package com.sishuok.jiangzh.archi.shopping.uuid.monitor.observers;

import com.sishuok.jiangzh.archi.shopping.uuid.monitor.vo.MonitorModel;

import java.util.Observable;
import java.util.Observer;
import java.util.Set;

/*
    当业务量超过阈值，我们就要把业务停掉
 */
public class ServerPrintObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof MonitorModel){
            MonitorModel monitorModel = (MonitorModel)arg;
            Set<String> keys = monitorModel.getBusinessNum().keySet();
            for(String key : keys){
                System.err.println(key + " , "+ monitorModel.getBusinessNum().get(key));
            }
        }

    }
}
