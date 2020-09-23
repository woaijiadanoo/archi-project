package com.sishuok.jiangzh.archi.designs.adapter.demo.v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class V1ESLog {

    private static List<Map<String,String>> esDB = new ArrayList<>();

    public void writeESLog(String index, String log){
        // 写入文件流
        Map<String,String> logMap = new HashMap<>();
        logMap.put(index, log);

        esDB.add(logMap);
        System.out.println("es log index : "+index + " , log :" + log);
    }

    public void printLog(){
        esDB.stream().forEach(System.out::println);
    }

}
