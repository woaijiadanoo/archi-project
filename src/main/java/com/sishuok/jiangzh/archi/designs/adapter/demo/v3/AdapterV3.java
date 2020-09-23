package com.sishuok.jiangzh.archi.designs.adapter.demo.v3;

import com.sishuok.jiangzh.archi.designs.adapter.demo.v3.blog.BLogAPI;
import com.sishuok.jiangzh.archi.designs.adapter.demo.v3.clog.CLogAPI;

public class AdapterV3 implements BLogAPI, CLogAPI {

    private BLogAdaptee bLogAdaptee;
    private CLogAdaptee cLogAdaptee;
    private static final String INDEX_NAME="allen";

    public AdapterV3(BLogAdaptee bLogAdaptee,CLogAdaptee cLogAdaptee){
        this.bLogAdaptee = bLogAdaptee;
        this.cLogAdaptee = cLogAdaptee;
    }

    @Override
    public void writeLog(String log) {
        bLogAdaptee.writeLog(log);
        cLogAdaptee.writeESLog(INDEX_NAME,log);
    }

    @Override
    public void writeESLog(String index, String log) {
        cLogAdaptee.writeESLog(index,log);
        bLogAdaptee.writeLog(log);
    }
}
