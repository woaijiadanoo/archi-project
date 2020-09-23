package com.sishuok.jiangzh.archi.designs.adapter.demo.v3.blog;

public class BLogImpl implements BLogAPI{
    @Override
    public void writeLog(String log) {
        System.out.println("blog log : "+ log);
    }
}
