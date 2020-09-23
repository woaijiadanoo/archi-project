package com.sishuok.jiangzh.archi.designs.adapter.demo.v2;

public class AdapterV2File implements AdapterV2LogAPI{

    private V2FileLog v2FileLog;

    public AdapterV2File(V2FileLog v2FileLog){
        this.v2FileLog = v2FileLog;
    }

    @Override
    public void writeLog(String log) {
        v2FileLog.writeLog(log);
    }

    @Override
    public void printLog() {
        v2FileLog.printLog();
    }
}
