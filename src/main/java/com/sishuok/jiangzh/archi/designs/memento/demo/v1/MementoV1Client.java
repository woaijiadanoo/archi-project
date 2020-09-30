package com.sishuok.jiangzh.archi.designs.memento.demo.v1;

public class MementoV1Client {

    public static void main(String[] args) {
        V1UserMock userMock = new V1UserMock();

        // 用户身份认证
        userMock.userAuth();
        String userState = userMock.getUserState();
        int vipLevel = userMock.getVipLevel();

        // 折扣方案
        userMock.schemaOne();

        // 满减方案
        // 数据初始化
        userMock.setUserState(userState);
        userMock.setVipLevel(vipLevel);
        userMock.schemaTwo();

    }

}
