package com.sishuok.jiangzh.archi.shopping.finance.service;

import com.sishuok.jiangzh.archi.shopping.finance.decorator.DecoratorEnum;

import java.util.List;

public interface FinanceServiceAPI {

    // 业务中进行成本计算
    /*
       decoratorEnums -> 有多少组件进行装饰使用
     */
    double calcPrize(String user, int phoneNum, List<DecoratorEnum> decoratorEnums);

}
