package com.sishuok.jiangzh.archi.shopping.permit.dispatcher.vo;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.base.BaseVO;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class PermitModel extends BaseVO {

    private String permitStr;  // p:1,c:2

    @Override
    public String toString() {
        return "PermitModel{" +
                "permitStr='" + permitStr + '\'' +
                '}';
    }

    public String getPermitStr() {
        return permitStr;
    }

    public void setPermitStr(String permitStr) {
        this.permitStr = permitStr;
    }
}
