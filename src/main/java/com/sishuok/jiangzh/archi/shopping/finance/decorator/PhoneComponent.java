package com.sishuok.jiangzh.archi.shopping.finance.decorator;

import com.sishuok.jiangzh.archi.shopping.finance.flyweight.GoodsBasicFlyweight;
import com.sishuok.jiangzh.archi.shopping.finance.flyweight.GoodsBasicFlyweightFactory;

public class PhoneComponent extends ShoppingComponent{

    // 理论上应该只存一个id，然后从数据库中查询对应的数据
    private String goodsId = "01";
    private String goodsName = "华为P40 pro";
    private int goodsPrice = 7000;

    // 手机的基础价格
    @Override
    public double calcPrize(String user, int phoneNum) {
        GoodsBasicFlyweight flyweight = GoodsBasicFlyweightFactory.getFlyweight(goodsId, goodsName, goodsPrice);

        return flyweight.getPrice() * phoneNum;
    }
}
