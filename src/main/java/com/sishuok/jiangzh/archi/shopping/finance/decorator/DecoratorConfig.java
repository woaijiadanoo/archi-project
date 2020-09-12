package com.sishuok.jiangzh.archi.shopping.finance.decorator;

public class DecoratorConfig {

    // decorator 对应的 全限定名
    public static String getDecorator(DecoratorEnum decoratorEnum){
        return decoratorEnum.getName();
    }

}
