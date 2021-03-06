package com.sishuok.jiangzh.archi.designs.template.demo.v2;

import com.sishuok.jiangzh.archi.designs.template.demo.TemplateDB;

public class LoginOracleTemplate extends LoginAbstrctTemplate{
    @Override
    boolean isMatch(String pwd, String dbPwd) {
        if(pwd.equals(dbPwd)){
            return true;
        }
        return false;
    }

    @Override
    String entype(String pwd) {
        System.out.println("加密方式是KeyCenter，加密以后的内容为 : pwd = " + pwd);
        return pwd;
    }

    @Override
    String getByUserName(String userName) {
        System.out.println("这是Oracle中获取数据, userName : " + userName);
        return TemplateDB.getUserDB().get(userName);
    }
}
