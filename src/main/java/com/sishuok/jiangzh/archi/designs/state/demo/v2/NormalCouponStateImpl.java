package com.sishuok.jiangzh.archi.designs.state.demo.v2;

/*
    正常领取
 */
public class NormalCouponStateImpl implements CouponState{
    @Override
    public void takeCoupon(String userName, String type, CouponManager couponManager) {
        String userType = couponManager.getCouponTypeDB().get(userName);
        if(userType == null){
            couponManager.getCouponTypeDB().put(userName, type);
        }
        System.out.println("正常领取");
    }
}
