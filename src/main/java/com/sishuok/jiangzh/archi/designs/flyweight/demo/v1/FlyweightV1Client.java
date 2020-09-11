package com.sishuok.jiangzh.archi.designs.flyweight.demo.v1;

public class FlyweightV1Client {

    public static void main(String[] args) {
        V1SecurityMgr securityMgr = new V1SecurityMgr();

        securityMgr.login("张三");
        securityMgr.login("李四");

        boolean f1 = securityMgr.hasPermit("张三", "工资清单", "查看");
        boolean f2 = securityMgr.hasPermit("李四", "工资清单", "修改");

        System.out.println("f1 = " + f1 + "  , f2 = " + f2);

    }

}
