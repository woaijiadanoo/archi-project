package com.sishuok.jiangzh.archi.shopping.finance.decorator;

import com.sishuok.jiangzh.archi.shopping.finance.flyweight.GoodsBasicFlyweight;
import com.sishuok.jiangzh.archi.shopping.finance.flyweight.GoodsBasicFlyweightFactory;

public class InsuranceDecorator extends ShoppingDecorator{
    public InsuranceDecorator(ShoppingComponent component) {
        super(component);
    }

    private String goodsId = "03";
    private String goodsName = "增值保险服务";
    private int goodsPrice = 300;

    @Override
    public double calcPrize(String user, int phoneNum) {
        GoodsBasicFlyweight flyweight = GoodsBasicFlyweightFactory.getFlyweight(goodsId, goodsName, goodsPrice);
        return super.calcPrize(user, phoneNum) + flyweight.getPrice() * phoneNum;
    }
}
