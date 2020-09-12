package com.sishuok.jiangzh.archi.shopping.finance.decorator;

public abstract class ShoppingDecorator extends ShoppingComponent{

    private ShoppingComponent component;

    public ShoppingDecorator(ShoppingComponent component){
        this.component = component;
    }

    @Override
    public double calcPrize(String user, int phoneNum) {
        return component.calcPrize(user,phoneNum);
    }
}
