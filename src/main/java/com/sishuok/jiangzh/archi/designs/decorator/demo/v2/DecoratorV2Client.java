package com.sishuok.jiangzh.archi.designs.decorator.demo.v2;


public class DecoratorV2Client {

    public static void main(String[] args) {
        /*
            1、基础底薪
            2、每月销售额的3%
            3、业务经理要获取团队总收益的1%
         */
        V2Prize prize = new V2BasicPrize();
        V2Prize monthPrize = new V2MonthPrizeDecorator(prize);
        V2Prize groupPrize = new V2GroupPrizeDecorator(monthPrize);
        V2Prize totalPrize = new V2TotalPrizeDecorator(groupPrize);

        double d1 = totalPrize.calcPrize("张三");
        double d2 = totalPrize.calcPrize("Jiangzh");
        double d3 = totalPrize.calcPrize("Allen");

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

    }

}
