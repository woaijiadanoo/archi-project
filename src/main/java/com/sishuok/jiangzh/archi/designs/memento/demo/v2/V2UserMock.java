package com.sishuok.jiangzh.archi.designs.memento.demo.v2;

public class V2UserMock {

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

    /*
        创建某一时刻的快照
     */
    public UserMockMemento createMemento(){
        return new UserMockMementoImpl(this.userState,this.vipLevel);
    }

    /*
        恢复某一时刻的快照
     */
    public void setMemento(UserMockMemento memento){
        if(memento instanceof UserMockMementoImpl){
            UserMockMementoImpl userMockMemento = (UserMockMementoImpl)memento;
            this.userState = userMockMemento.getUserState();
            this.vipLevel = userMockMemento.getVipLevel();
        }
    }

    private class UserMockMementoImpl implements UserMockMemento{
        private String userState;
        private int vipLevel;

        public UserMockMementoImpl(String userState,int vipLevel){
            this.userState = userState;
            this.vipLevel = vipLevel;
        }

        public String getUserState() {
            return userState;
        }

        public int getVipLevel() {
            return vipLevel;
        }
    }

}
