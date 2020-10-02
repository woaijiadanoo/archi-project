package com.sishuok.jiangzh.archi.designs.state.demo.v2;

/*
    恶意刷单
 */
public class SpiteCouponStateImpl implements CouponState{
    @Override
    public void takeCoupon(String userName, String type, CouponManager couponManager) {
        String userType = couponManager.getCouponTypeDB().get(userName);
        if(userType != null){
            couponManager.getCouponTypeDB().remove(userName);
        }
        System.out.println("存在恶意刷单，请注意");
    }
}
