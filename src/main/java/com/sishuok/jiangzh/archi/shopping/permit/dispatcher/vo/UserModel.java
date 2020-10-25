package com.sishuok.jiangzh.archi.shopping.permit.dispatcher.vo;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.base.BaseVO;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class UserModel extends BaseVO {

    private String userName;

    @Override
    public String toString() {
        return "UserModel{" +
                "userName='" + userName + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
