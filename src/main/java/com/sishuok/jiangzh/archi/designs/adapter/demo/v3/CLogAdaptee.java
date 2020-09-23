package com.sishuok.jiangzh.archi.designs.adapter.demo.v3;

import com.sishuok.jiangzh.archi.designs.adapter.demo.v3.clog.CLogAPI;

public class CLogAdaptee{

    public void writeESLog(String index,String log) {
        System.out.println("Clog index: "+index+" , log : "+ log);
    }
}
