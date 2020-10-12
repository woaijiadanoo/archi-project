package com.sishuok.jiangzh.archi.designs.proxy.demo.v1;

import com.sishuok.jiangzh.archi.designs.proxy.demo.ProxyUserDB;
import com.sishuok.jiangzh.archi.designs.proxy.demo.v2.ProxyUserInfoAPI;

import java.util.List;

public class ProxyV1Client {

    public static void main(String[] args) {
        List<ProxyUserInfoAPI> proxyUserModels = null;

        proxyUserModels = describeUsers();

        System.out.println("proxyUserModels = " + proxyUserModels);
    }

    private static List<ProxyUserInfoAPI> describeUsers(){
        List<ProxyUserInfoAPI> userDB = ProxyUserDB.getUserDB();
        return userDB;
    }

}
