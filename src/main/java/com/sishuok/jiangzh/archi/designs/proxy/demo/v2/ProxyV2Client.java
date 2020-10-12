package com.sishuok.jiangzh.archi.designs.proxy.demo.v2;

import com.sishuok.jiangzh.archi.designs.proxy.demo.ProxyUserDB;
import java.util.List;

public class ProxyV2Client {

    public static void main(String[] args) {
        List<ProxyUserInfoAPI> proxyUserModels = null;

        proxyUserModels = describeUsers();

        proxyUserModels.stream().forEach((u)->{
            u.getAddress();

            System.out.println(u);
        });
    }

    private static List<ProxyUserInfoAPI> describeUsers(){
        List<ProxyUserInfoAPI> userDB = ProxyUserDB.getUsers();

        return userDB;
    }

}
