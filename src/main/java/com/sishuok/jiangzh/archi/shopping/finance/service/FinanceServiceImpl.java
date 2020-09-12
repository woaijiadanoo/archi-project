package com.sishuok.jiangzh.archi.shopping.finance.service;

import com.sishuok.jiangzh.archi.shopping.finance.decorator.DecoratorConfig;
import com.sishuok.jiangzh.archi.shopping.finance.decorator.DecoratorEnum;
import com.sishuok.jiangzh.archi.shopping.finance.decorator.PhoneComponent;
import com.sishuok.jiangzh.archi.shopping.finance.decorator.ShoppingComponent;

import java.lang.reflect.Constructor;
import java.util.List;

public class FinanceServiceImpl implements FinanceServiceAPI{
    /*
        价格计算业务实现
     */
    @Override
    public double calcPrize(String user, int phoneNum, List<DecoratorEnum> decoratorEnums) {
        double totalPrice = 0.0;
        ShoppingComponent initComponent = new PhoneComponent();
        // 项目中常见的变形
        for(DecoratorEnum decoratorEnum : decoratorEnums){
            initComponent = getComponent(decoratorEnum, initComponent);
        }

        totalPrice = initComponent.calcPrize(user,phoneNum);

        return totalPrice;
    }

    /*
        通过反射获取对应的Decorator
     */
    private ShoppingComponent getComponent(DecoratorEnum dEnum, ShoppingComponent component){
        String clsName = DecoratorConfig.getDecorator(dEnum);
        try {
            Class cls = Class.forName(clsName);
            Constructor constructor = cls.getDeclaredConstructor(ShoppingComponent.class);
            ShoppingComponent shoppingComponent = (ShoppingComponent)constructor.newInstance(component);

            return shoppingComponent;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
