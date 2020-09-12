package com.sishuok.jiangzh.archi.designs.decorator.demo;

import java.util.HashMap;
import java.util.Map;

public class DecoratorDB {

    public static Map<String,Double> db = new HashMap<>();

    // init 销售额
    static {
        db.put("Allen", 1000.0);
        db.put("Jiangzh", 2000.0);
        db.put("张三", 4000.0);
    }

}
