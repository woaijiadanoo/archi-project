package com.sishuok.jiangzh.archi.designs.flyweight.demo.v1;

import com.sishuok.jiangzh.archi.designs.flyweight.demo.FlyweightDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    权限管理
 */
public class V1SecurityMgr {

    // 模拟服务器session 或者模拟redis缓存
    private static Map<String, List<V1AuthModel>> session = new HashMap<>();

    // 模拟登录
    // 张三,查看,工资清单
    public void login(String user){
        List<String> db = FlyweightDB.getDb();
        List<V1AuthModel> userAuth = new ArrayList<>();
        for(String line : db){
            String[] lineArray = line.split(",");
            if(lineArray[0].equals(user)){
                V1AuthModel v1AuthModel = new V1AuthModel();
                v1AuthModel.setUser(lineArray[0]);
                v1AuthModel.setPermit(lineArray[1]);
                v1AuthModel.setResource(lineArray[2]);
                // 将用户权限封装成数据
                userAuth.add(v1AuthModel);
            }
        }

        session.put(user, userAuth);
    }

    // 判断用户是否有什么权限
    public boolean hasPermit(String user, String resource, String permit){
        List<V1AuthModel> v1AuthModels = session.get(user);
        // 判断是否为空

        // 判断是否对相应的资源有权限
        for(V1AuthModel v1AuthModel : v1AuthModels){
            System.out.println("v1AuthModel : "+ v1AuthModel);
            if(v1AuthModel.getResource().equals(resource) && v1AuthModel.getPermit().equals(permit)){
                return true;
            }
        }

        return false;
    }

}
