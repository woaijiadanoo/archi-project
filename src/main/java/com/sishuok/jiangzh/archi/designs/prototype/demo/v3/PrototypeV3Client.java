package com.sishuok.jiangzh.archi.designs.prototype.demo.v3;

import com.sishuok.jiangzh.archi.designs.prototype.demo.service.EnterpriseOrder;
import com.sishuok.jiangzh.archi.designs.prototype.demo.v3.vo.ProducetOrderModel;
import com.sishuok.jiangzh.archi.designs.prototype.demo.v3.vo.UserOrderModel;

public class PrototypeV3Client {

    public static void main(String[] args) {
        // 演示Java自带的clone方法
//        test01();

        // 原型模式的基本实现
//        test02();

        // 深度克隆模式
        test03();
    }

    /*
        深度克隆模式
     */
    private static void test03(){
        ProducetOrderModel pom = new ProducetOrderModel("001","生鲜");
        UserOrderModel uom =
                new UserOrderModel("jiangzh",pom,100);

        System.out.println("uom = " + uom);

        UserOrderModel clone = uom.clone();
        System.out.println("clone = " + clone);

    }

    // 原型模式的基本实现
    private static void test02(){
        /*UserOrderModel uom =
                new UserOrderModel("jiangzh","001",100);

        System.out.println("uom = " + uom);

        UserOrderModel clone = uom.clone();
        System.out.println("clone = " + clone);*/

    }

    /*
        演示Java自带的clone方法
     */
    private static void test01(){
        EnterpriseOrder enterpriseOrder1 =
                new EnterpriseOrder("sishuok","001", 2800);

        System.out.println("enterpriseOrder 1 = " + enterpriseOrder1);

        EnterpriseOrder enterpriseOrder2 = (EnterpriseOrder) enterpriseOrder1.javaClone();

        System.out.println("enterpriseOrder2 = " + enterpriseOrder2);

    }

}
