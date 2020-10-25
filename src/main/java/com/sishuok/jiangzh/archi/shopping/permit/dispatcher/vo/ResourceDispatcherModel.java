package com.sishuok.jiangzh.archi.shopping.permit.dispatcher.vo;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.base.BaseVO;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ResourceDispatcherModel extends BaseVO {

    private String ownerId;
    private int type; // 1-用户，2-角色，3-组织机构，4-工作组
    private String resourcePermitId;

    @Override
    public String toString() {
        return "ResourceDispatcherModel{" +
                "ownerId='" + ownerId + '\'' +
                ", type=" + type +
                ", resourcePermitId='" + resourcePermitId + '\'' +
                '}';
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getResourcePermitId() {
        return resourcePermitId;
    }

    public void setResourcePermitId(String resourcePermitId) {
        this.resourcePermitId = resourcePermitId;
    }
}
