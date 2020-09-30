package com.sishuok.jiangzh.archi.designs.memento.demo.v1;

public class V1UserMock {

    private String userName;
    private String userState;
    private int vipLevel;

    /*
        初始流程
     */
    public void userAuth(){
        this.userName = "Allen";
        this.userState = "VIP";
        this.vipLevel = 5;
    }

    public void schemaOne(){
        this.userState += ",折扣会员";
        this.vipLevel += 1;
        System.out.println("会员："+this.userName+",当前状态："+this.userState+",VIP等级："+this.vipLevel);
    }

    public void schemaTwo(){
        this.userState += ",满减会员";
        this.vipLevel += 2;
        System.out.println("会员："+this.userName+",当前状态："+this.userState+",VIP等级："+this.vipLevel);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }

    public int getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }
}
