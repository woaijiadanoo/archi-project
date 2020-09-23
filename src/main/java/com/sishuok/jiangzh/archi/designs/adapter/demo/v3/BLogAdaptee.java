package com.sishuok.jiangzh.archi.designs.adapter.demo.v3;

import com.sishuok.jiangzh.archi.designs.adapter.demo.v3.blog.BLogAPI;

public class BLogAdaptee{

    public void writeLog(String log) {
        System.out.println("blog log : "+ log);
    }
}
