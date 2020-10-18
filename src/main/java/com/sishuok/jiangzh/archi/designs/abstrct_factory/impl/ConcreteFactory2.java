package com.sishuok.jiangzh.archi.designs.abstrct_factory.impl;

public class ConcreteFactory2 implements AbstrctFactory {

    public AbstrctProductA createProductA(){
        return new ProductA2();
    }

    public AbstrctProductB createProductB(){
        return new ProductB2();
    }

}
