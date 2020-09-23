package com.sishuok.jiangzh.archi.designs.adapter.demo.v2;

public class AdapterV2ES implements AdapterV2LogAPI{

    private V2ESLog v2ESLog;
    // 配置 & 约定俗成
    private static final String INDEX_NAME="allen";

    public AdapterV2ES(V2ESLog v2ESLog){
        this.v2ESLog = v2ESLog;
    }

    @Override
    public void writeLog(String log) {
        v2ESLog.writeESLog(INDEX_NAME, log);
    }

    @Override
    public void printLog() {
        v2ESLog.printLog();
    }
}
