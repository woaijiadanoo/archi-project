package com.sishuok.jiangzh.archi.shopping.uuid.monitor.observers;

import com.sishuok.jiangzh.archi.shopping.uuid.monitor.vo.MonitorModel;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/*
    当业务量超过阈值，我们就要把业务停掉
 */
public class ServerStopObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof MonitorModel){
            MonitorModel monitorModel = (MonitorModel)arg;
            if(monitorModel.getBusinessNum().get(monitorModel.getBusinessType()) > 5){
                System.out.println("业务量报警，可能存在薅羊毛的情况，请停止业务实现");
            }
        }

    }
}
