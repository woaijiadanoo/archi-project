package com.sishuok.jiangzh.archi.designs.flyweight.demo;

import java.util.ArrayList;
import java.util.List;

public class FlyweightDB {

    // 张三,查看,工资清单
    private static List<String> db = new ArrayList<>();

    // init
    static{
        db.add("张三,查看,工资清单");
        db.add("李四,查看,工资清单");
        db.add("李四,查看,人员列表");
        db.add("李四,修改,人员列表");
    }

    public static List<String> getDb() {
        return db;
    }
}
