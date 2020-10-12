package com.sishuok.jiangzh.archi.designs.proxy.demo;

import com.sishuok.jiangzh.archi.designs.proxy.demo.v2.ProxyUserInfo;
import com.sishuok.jiangzh.archi.designs.proxy.demo.v2.ProxyUserInfoAPI;
import com.sishuok.jiangzh.archi.designs.proxy.demo.vo.ProxyUserModel;

import java.util.ArrayList;
import java.util.List;

public class ProxyUserDB {

    private static List<ProxyUserInfoAPI> userDB = new ArrayList<>();

    static{
        userDB.add(new ProxyUserModel(1,"Allen1",18,"北京","123"));
        userDB.add(new ProxyUserModel(2,"Allen2",18,"北京","123"));
        userDB.add(new ProxyUserModel(3,"Allen3",18,"北京","123"));
        userDB.add(new ProxyUserModel(4,"Allen4",18,"北京","123"));
        userDB.add(new ProxyUserModel(5,"Allen5",18,"北京","123"));
        userDB.add(new ProxyUserModel(6,"Allen6",18,"北京","123"));
        userDB.add(new ProxyUserModel(7,"Allen7",18,"北京","123"));
    }

    public static List<ProxyUserInfoAPI> getUsers() {
        // select id,name,age from user;
        List<ProxyUserInfoAPI> result = new ArrayList<>();
        for (ProxyUserInfoAPI userInfoAPI : userDB){
            ProxyUserInfoAPI userInfo = new ProxyUserInfo(new ProxyUserModel());
            userInfo.setUserId(userInfoAPI.getUserId());
            userInfo.setAge(userInfoAPI.getAge());
            userInfo.setName(userInfoAPI.getName());

            result.add(userInfo);
        }
        return result;
    }

    public static List<ProxyUserInfoAPI> getUserDB() {
        return userDB;
    }
}
