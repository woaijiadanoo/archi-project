package com.sishuok.jiangzh.archi.designs.state.demo.v2;

/*
    重复领取
 */
public class RepeatCouponStateImpl implements CouponState{
    @Override
    public void takeCoupon(String userName, String type, CouponManager couponManager) {
        System.out.println("不能重复领取");
    }
}
