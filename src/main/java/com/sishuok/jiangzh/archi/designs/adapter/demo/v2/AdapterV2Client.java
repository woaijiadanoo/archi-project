package com.sishuok.jiangzh.archi.designs.adapter.demo.v2;

public class AdapterV2Client {

    public static void main(String[] args) {
        V2FileLog v2FileLog = new V2FileLog();
        V2ESLog v2ESLog = new V2ESLog();

        // 客户端调用
//        AdapterV2LogAPI api = new AdapterV2File(v2FileLog);
        AdapterV2LogAPI api = new AdapterV2ES(v2ESLog);

        for(int i=0;i<10;i++){
            api.writeLog("log :"+i);
        }

        api.printLog();

    }

}
