package com.sishuok.jiangzh.archi.designs.adapter.demo.v2;

import java.util.ArrayList;
import java.util.List;

public class V2FileLog{

    private static List<String> fileDB = new ArrayList<>();

    public void writeLog(String log) {
        // 写入文件流
        fileDB.add(log);
        System.out.println("file log = " + log);
    }

    public void printLog() {
        fileDB.stream().forEach(System.out::println);
    }
}
