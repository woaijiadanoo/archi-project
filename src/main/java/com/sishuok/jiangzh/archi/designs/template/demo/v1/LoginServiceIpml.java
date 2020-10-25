package com.sishuok.jiangzh.archi.designs.template.demo.v1;

import com.sishuok.jiangzh.archi.designs.template.demo.TemplateDB;

public class LoginServiceIpml implements LoginService{
    @Override
    public boolean login(String userName, String pwd) {
        /*
            1.1 获取用户输入的用户名和密码
			1.2 根据用户名获取用户信息
			1.3 将用户输入的密码加密 与 数据库中密码进行匹配，如果一样，则登录成功
         */
        String dbPwd = getByUserName(userName);
        String entyPwd = entype(pwd);

        return isMatch(entyPwd,dbPwd);
    }

    private boolean isMatch(String pwd,String dbPwd){
        if(pwd.equals(dbPwd)){
            return true;
        }
        return false;
    }

    private String entype(String pwd){
        System.out.println("加密以后的数据 : pwd = " + pwd);
        return pwd;
    }

    private String getByUserName(String userName){
        return TemplateDB.getUserDB().get(userName);
    }

}
