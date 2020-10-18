package com.sishuok.jiangzh.archi.designs.abstrct_factory.impl;

public class ConcreteFactory1 implements AbstrctFactory{

    public AbstrctProductA createProductA(){
        return new ProductA1();
    }

    public AbstrctProductB createProductB(){
        return new ProductB1();
    }

}
