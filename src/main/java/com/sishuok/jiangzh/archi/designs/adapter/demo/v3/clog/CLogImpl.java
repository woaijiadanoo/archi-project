package com.sishuok.jiangzh.archi.designs.adapter.demo.v3.clog;

public class CLogImpl implements CLogAPI{
    @Override
    public void writeESLog(String index,String log) {
        System.out.println("Clog index: "+index+" , log : "+ log);
    }
}
