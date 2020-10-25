package com.sishuok.jiangzh.archi.shopping.permit.dispatcher.vo;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.base.BaseVO;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class RoleModel extends BaseVO {

    private String showName;
    private String roleName;

    @Override
    public String toString() {
        return "RoleModel{" +
                "showName='" + showName + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
