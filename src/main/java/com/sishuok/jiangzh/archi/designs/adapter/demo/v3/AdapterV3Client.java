package com.sishuok.jiangzh.archi.designs.adapter.demo.v3;

import com.sishuok.jiangzh.archi.designs.adapter.demo.v3.blog.BLogAPI;
import com.sishuok.jiangzh.archi.designs.adapter.demo.v3.blog.BLogImpl;
import com.sishuok.jiangzh.archi.designs.adapter.demo.v3.clog.CLogAPI;
import com.sishuok.jiangzh.archi.designs.adapter.demo.v3.clog.CLogImpl;

public class AdapterV3Client {

    public static void main(String[] args) {
        String index = "allen";
        String log = "this is a log";

        // B端调用
//        blog(log);
        // C端调用
//        clog(index,log);

        // 前期准备工作
        BLogAdaptee bLogAdaptee = new BLogAdaptee();
        CLogAdaptee cLogAdaptee = new CLogAdaptee();
        // 升级版本以后的处理方式
        BLogAPI bApi = new AdapterV3(bLogAdaptee,cLogAdaptee);
        CLogAPI cApi = new AdapterV3(bLogAdaptee,cLogAdaptee);

        // B端业务
        bApi.writeLog(log);
        // C端业务
        cApi.writeESLog(index,log);

    }


    private static void blog(String log){
        BLogAPI bLogAPI = new BLogImpl();
        bLogAPI.writeLog(log);
    }

    private static void clog(String index,String log){
        CLogAPI cLogAPI = new CLogImpl();
        cLogAPI.writeESLog(index,log);
    }

}
