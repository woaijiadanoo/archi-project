package com.sishuok.jiangzh.archi.designs.flyweight.demo.v1;

public class V1AuthModel {

    private String user;
    // 待操作的资源
    private String resource;
    // 权限
    private String permit;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getPermit() {
        return permit;
    }

    public void setPermit(String permit) {
        this.permit = permit;
    }
}
