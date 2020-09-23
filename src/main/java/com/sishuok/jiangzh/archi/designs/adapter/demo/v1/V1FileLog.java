package com.sishuok.jiangzh.archi.designs.adapter.demo.v1;

import java.util.ArrayList;
import java.util.List;

public class V1FileLog {

    private static List<String> fileDB = new ArrayList<>();

    public void writeFileLog(String log){
        // 写入文件流
        fileDB.add(log);
        System.out.println("file log = " + log);
    }


    public void printLog(){
        fileDB.stream().forEach(System.out::println);
    }

}
