package com.sishuok.jiangzh.archi.designs.template.demo;

import java.util.HashMap;
import java.util.Map;

public class TemplateDB {

    private static Map<String, String> userDB = new HashMap<>();

    static {
        userDB.put("Allen","111");
        userDB.put("Jiangzh","333");
    }

    public static Map<String, String> getUserDB() {
        return userDB;
    }
}
