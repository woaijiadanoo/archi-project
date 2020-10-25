package com.sishuok.jiangzh.archi.shopping.permit.dispatcher.vo;

import com.sishuok.jiangzh.archi.shopping.permit.dispatcher.api.base.BaseVO;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ResourceModel extends BaseVO {

    private String resourceName;
    private String resourcePath; // 资源  /api/a/b/c.controller
    private String resourceDesc;

    @Override
    public String toString() {
        return "ResourceModel{" +
                "resourceName='" + resourceName + '\'' +
                ", resourcePath='" + resourcePath + '\'' +
                ", resourceDesc='" + resourceDesc + '\'' +
                '}';
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String getResourceDesc() {
        return resourceDesc;
    }

    public void setResourceDesc(String resourceDesc) {
        this.resourceDesc = resourceDesc;
    }
}
