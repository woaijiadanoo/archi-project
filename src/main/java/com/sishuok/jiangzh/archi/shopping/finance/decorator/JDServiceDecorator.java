package com.sishuok.jiangzh.archi.shopping.finance.decorator;

import com.sishuok.jiangzh.archi.shopping.finance.flyweight.GoodsBasicFlyweight;
import com.sishuok.jiangzh.archi.shopping.finance.flyweight.GoodsBasicFlyweightFactory;

public class JDServiceDecorator extends ShoppingDecorator{

    public JDServiceDecorator(ShoppingComponent component) {
        super(component);
    }

    private String goodsId = "02";
    private String goodsName = "京东服务";
    private int goodsPrice = 40;

    @Override
    public double calcPrize(String user, int phoneNum) {
        GoodsBasicFlyweight flyweight = GoodsBasicFlyweightFactory.getFlyweight(goodsId, goodsName, goodsPrice);
        // 京东服务 + 40元
        return super.calcPrize(user, phoneNum) + flyweight.getPrice() * phoneNum;
    }
}
