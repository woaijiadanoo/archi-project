package com.sishuok.jiangzh.archi.designs.flyweight.demo.v2;

import com.sishuok.jiangzh.archi.designs.flyweight.demo.FlyweightDB;
import com.sishuok.jiangzh.archi.designs.flyweight.demo.v1.V1AuthModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    权限管理
 */
public class V2SecurityMgr {

    // 模拟服务器session 或者模拟redis缓存
    private static Map<String, List<V2Flyweight>> session = new HashMap<>();

    // 模拟登录
    // 张三,查看,工资清单
    public void login(String user){
        List<String> db = FlyweightDB.getDb();
        List<V2Flyweight> userAuth = new ArrayList<>();
        for(String line : db){
            String[] lineArray = line.split(",");
            if(lineArray[0].equals(user)){
                String key = lineArray[1]+","+lineArray[2];
                V2Flyweight flyweight = V2FlyweightFactory.getFlyweight(key);
                // 将用户权限封装成数据
                userAuth.add(flyweight);
            }
        }

        session.put(user, userAuth);
    }

    // 判断用户是否有什么权限
    public boolean hasPermit(String user, String resource, String permit){
        List<V2Flyweight> v1AuthModels = session.get(user);
        // 判断是否为空

        // 判断是否对相应的资源有权限
        for(V2Flyweight flyweight : v1AuthModels){
            System.out.println("flyweight : "+ flyweight);
            if(flyweight.match(resource,permit)){
                return true;
            }
        }

        return false;
    }

}
