package com.sishuok.jiangzh.archi.shopping.finance.flyweight;

public class GoodsBasicFlyweightImpl implements GoodsBasicFlyweight{

    private String goodsId;
    private String goodsName;
    private double goodsPrice;

    public GoodsBasicFlyweightImpl(String goodsId, String goodsName, double goodsPrice){
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    @Override
    public double getPrice() {
        return this.getGoodsPrice();
    }
}
