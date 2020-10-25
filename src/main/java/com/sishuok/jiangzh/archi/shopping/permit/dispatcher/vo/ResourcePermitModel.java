package com.sishuok.jiangzh.archi.shopping.permit.dispatcher.vo;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.base.BaseVO;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ResourcePermitModel extends BaseVO {

    private String resourceId;
    private String permitId;

    @Override
    public String toString() {
        return "ResourcePermitModel{" +
                "resourceId='" + resourceId + '\'' +
                ", permitId='" + permitId + '\'' +
                '}';
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getPermitId() {
        return permitId;
    }

    public void setPermitId(String permitId) {
        this.permitId = permitId;
    }
}
