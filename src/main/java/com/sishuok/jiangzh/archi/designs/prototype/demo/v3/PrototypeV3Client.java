package com.sishuok.jiangzh.archi.designs.prototype.demo.v3;

import com.sishuok.jiangzh.archi.designs.prototype.demo.service.EnterpriseOrder;

public class PrototypeV3Client {

    public static void main(String[] args) {
        // 演示Java自带的clone方法
        test01();

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
