package com.sishuok.jiangzh.archi.designs.state.demo.v2;

import java.util.HashMap;
import java.util.Map;

public class StateV2Client {

    private static void test01(String userName, String type){
        CouponManager couponManager = new CouponManager();

        couponManager.request(userName, type);
    }

    public static void main(String[] args) {
        String name = "Allen";
        String type = "满三百减二十";

        for(int i=0; i<10; i++){
            test01(name, type);
        }

    }

}
