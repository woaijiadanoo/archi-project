package com.sishuok.jiangzh.archi.shopping.finance.decorator;

public enum DecoratorEnum {

    PHONE_DECORATOR("com.sishuok.jiangzh.archi.shopping.finance.decorator.PhoneComponent"),
    INSURANCE_DECORATOR("com.sishuok.jiangzh.archi.shopping.finance.decorator.InsuranceDecorator"),
    JD_SERVICE_DECORATOR("com.sishuok.jiangzh.archi.shopping.finance.decorator.JDServiceDecorator");

    private String name;

    DecoratorEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
