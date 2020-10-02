package com.sishuok.jiangzh.archi.designs.state.demo.v2;

/*
    恶意刷单
 */
public class BlackCouponStateImpl implements CouponState{
    @Override
    public void takeCoupon(String userName, String type, CouponManager couponManager) {
        String userType = couponManager.getCouponTypeDB().get(userName);
        if(userType != null){
            couponManager.getCouponTypeDB().remove(userName);
        }
        System.out.println("您已加入黑名单，三天以后才能正常使用");
    }
}
