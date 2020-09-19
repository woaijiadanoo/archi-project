package com.sishuok.jiangzh.archi.designs.strategy.demo.v2;

public class PriceContext {

    private PriceStrategy priceStrategy;

    public PriceContext(PriceStrategy priceStrategy){
        this.priceStrategy = priceStrategy;
    }

    public double quota(double price){
        return this.priceStrategy.calcPrice(price);
    }

}
