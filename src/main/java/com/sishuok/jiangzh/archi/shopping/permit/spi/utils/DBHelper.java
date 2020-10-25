package com.sishuok.jiangzh.archi.shopping.permit.spi.utils;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.base.BaseVO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBHelper{

    /*
        String - 表名, List - 表里的数据
     */
    private static Map<String, List> db = new HashMap<>();

    public static Map<String, List> getDb() {
        return db;
    }
}
