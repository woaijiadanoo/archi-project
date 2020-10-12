package com.sishuok.jiangzh.archi.designs.proxy.demo.v2;

public class ProxyUserInfo implements ProxyUserInfoAPI{

    private ProxyUserInfoAPI realUser;

    public ProxyUserInfo(ProxyUserInfoAPI realUser){
        this.realUser = realUser;
    }

    @Override
    public int getUserId() {
        return realUser.getUserId();
    }

    @Override
    public void setUserId(int userId) {
        realUser.setUserId(userId);
    }

    @Override
    public String getName() {
        return realUser.getName();
    }

    @Override
    public void setName(String name) {
        realUser.setName(name);
    }

    @Override
    public int getAge() {
        return realUser.getAge();
    }

    @Override
    public void setAge(int age) {
        realUser.setAge(age);
    }

    @Override
    public String getAddress() {
        if(realUser.getAddress() == null || realUser.getAddress().trim().length()==0){
            reload();
        }
        return realUser.getAddress();
    }

    @Override
    public void setAddress(String address) {
        realUser.setAddress(address);
    }

    @Override
    public String getPhone() {
        if(realUser.getPhone() == null || realUser.getPhone().trim().length()==0){
            reload();
        }
        return realUser.getPhone();
    }

    @Override
    public void setPhone(String phone) {
        realUser.setPhone(phone);
    }

    private void reload(){
        // select address,phone from user where id = ${id};
        // 模拟数据库查询
        realUser.setAddress("北京");
        realUser.setPhone("123");
    }

    @Override
    public String toString() {
        return realUser.toString();
    }
}
