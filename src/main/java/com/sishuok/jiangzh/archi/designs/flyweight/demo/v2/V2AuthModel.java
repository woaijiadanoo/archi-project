package com.sishuok.jiangzh.archi.designs.flyweight.demo.v2;

public class V2AuthModel implements V2Flyweight{

    // 待操作的资源
    private String resource;
    // 权限
    private String permit;

    // 查看,工资列表
    public V2AuthModel(String state){
        String[] stateArray = state.split(",");
        this.permit = stateArray[0];
        this.resource = stateArray[1];
    }

    @Override
    public boolean match(String resource, String permit) {
        if(this.resource.equals(resource)
            && this.permit.equals(permit)){
            return true;
        }
        return false;
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
