package com.sishuok.jiangzh.archi.designs.abstrct_factory.impl;

public class AbstrctFactoryClient {

    public static void main(String[] args) {
        AbstrctFactory abstrctFactory = new ConcreteFactory1();

        AbstrctProductA productA = abstrctFactory.createProductA();
        AbstrctProductB productB = abstrctFactory.createProductB();


    }

}
