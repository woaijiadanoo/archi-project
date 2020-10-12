package com.sishuok.jiangzh.archi.designs.proxy.demo.vo;

import com.sishuok.jiangzh.archi.designs.proxy.demo.v2.ProxyUserInfoAPI;
import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class ProxyUserModel implements ProxyUserInfoAPI {

    private int userId;
    private String name;
    private int age;
    private String address;
    private String phone;

    public ProxyUserModel(){}


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
