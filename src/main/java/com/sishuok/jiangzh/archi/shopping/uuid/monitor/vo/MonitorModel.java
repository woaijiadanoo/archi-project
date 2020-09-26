package com.sishuok.jiangzh.archi.shopping.uuid.monitor.vo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
public class MonitorModel {

    private String businessType;
    private Map<String,Integer> businessNum;

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Map<String, Integer> getBusinessNum() {
        return businessNum;
    }

    public void setBusinessNum(Map<String, Integer> businessNum) {
        this.businessNum = businessNum;
    }
}
