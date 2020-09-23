package com.sishuok.jiangzh.archi.designs.adapter.demo.v1;

public class AdapterV1Client {

    public static void main(String[] args) {
        // 日志文件
//        v1Log();

        // ES日志
        v2Log();

    }

    private static void v2Log(){
        V1ESLog esLog = new V1ESLog();

        for(int i=0; i<10; i++){
            esLog.writeESLog("allen","日志 ：" + i);
        }

        esLog.printLog();
    }

    private static void v1Log(){
        V1FileLog fileLog = new V1FileLog();

        for(int i=0; i<10; i++){
            fileLog.writeFileLog("日志 ：" + i);
        }

        fileLog.printLog();
    }

}
