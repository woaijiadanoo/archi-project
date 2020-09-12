package com.sishuok.jiangzh.archi.shopping.finance;

import com.sishuok.jiangzh.archi.shopping.finance.decorator.DecoratorEnum;
import com.sishuok.jiangzh.archi.shopping.finance.factory.FinanceFactory;
import com.sishuok.jiangzh.archi.shopping.finance.service.FinanceServiceAPI;

import java.util.ArrayList;
import java.util.List;

public class FinanceClient {

    private static FinanceServiceAPI serviceAPI = FinanceFactory.createInstance();

    public static void main(String[] args) {
        String user = "Allen";
        int phoneNum = 2;
        // 单买手机
//        test(user, phoneNum);
        // 手机 + 保险 + 京东服务
        test2(user,phoneNum);
    }

    /*
        单买手机
     */
    private static void test(String user, int phoneNum){
        double total = serviceAPI.calcPrize(user, phoneNum, new ArrayList<>());
        System.out.println("total = " + total);
    }

    /*
        单买手机 + 保险 + 京东服务
     */
    private static void test2(String user, int phoneNum){
        List<DecoratorEnum> decoratorEnums = new ArrayList<>();
        decoratorEnums.add(DecoratorEnum.INSURANCE_DECORATOR);
        decoratorEnums.add(DecoratorEnum.JD_SERVICE_DECORATOR);

        double total = serviceAPI.calcPrize(user, phoneNum, decoratorEnums);
        System.out.println("total = " + total);
    }

}
