package com.sishuok.jiangzh.archi.shopping.uuid.strategy;

public class AlrogithmlContext {

    // 业务需要
    private String businessType;

    private IAlrogithmStrategy strategy;
    public AlrogithmlContext(IAlrogithmStrategy strategy){
        this.strategy = strategy;
    }

    public String getUuid(){
        return strategy.genUuid(this);
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
}
