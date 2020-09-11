package com.sishuok.jiangzh.archi.designs.flyweight.demo.v2;

import com.sishuok.jiangzh.archi.designs.flyweight.impl.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class V2FlyweightFactory {

    private static Map<String,V2Flyweight> fsMap = new HashMap<>();

    // 查看,工资列表
    // 修改,工资列表
    // 删除,工资列表
    public static V2Flyweight getFlyweight(String key){
        V2Flyweight v2Flyweight = fsMap.get(key);
        if(v2Flyweight == null){
            v2Flyweight = new V2AuthModel(key);

            fsMap.put(key, v2Flyweight);
        }
        return v2Flyweight;
    }

}
