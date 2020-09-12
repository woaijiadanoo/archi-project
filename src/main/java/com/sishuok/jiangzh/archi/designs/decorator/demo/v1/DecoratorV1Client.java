package com.sishuok.jiangzh.archi.designs.decorator.demo.v1;

public class DecoratorV1Client {

    public static void main(String[] args) {

        V1Prize prize = new V1Prize();

        double d1 = prize.calcPrize("张三");
        double d2 = prize.calcPrize("Jiangzh");
        double d3 = prize.calcPrize("Allen");

        System.out.println("张三 = " + d1);
        System.out.println("Jiangzh = " + d2);
        System.out.println("Allen = " + d3);

    }

}
