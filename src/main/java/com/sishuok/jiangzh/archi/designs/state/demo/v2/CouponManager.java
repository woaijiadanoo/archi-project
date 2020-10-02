package com.sishuok.jiangzh.archi.designs.state.demo.v2;

import java.util.HashMap;
import java.util.Map;

public class CouponManager {

    private CouponState couponState;
    private static Map<String,String> couponTypeDB = new HashMap<>();
    private static Map<String,Integer> couponNumDB = new HashMap<>();

    public Map<String,String> getCouponTypeDB(){
        return couponTypeDB;
    }

    public void request(String userName,String type){
        Integer oldNum = couponNumDB.get(userName);
        // 判断初始化数据
        if(oldNum == null){
            oldNum = 1;
            couponNumDB.put(userName, oldNum);
        }else{
            oldNum += 1;
            couponNumDB.put(userName, oldNum);
        }

        if(oldNum == 1){
            couponState = new NormalCouponStateImpl();
        }else if(oldNum >= 2 && oldNum < 5){
            couponState = new RepeatCouponStateImpl();
        }else if(oldNum >= 5 && oldNum < 10){
            couponState = new SpiteCouponStateImpl();
        }else if(oldNum >= 10){
            couponState = new BlackCouponStateImpl();
        }

        couponState.takeCoupon(userName,type,this);
    }

}
