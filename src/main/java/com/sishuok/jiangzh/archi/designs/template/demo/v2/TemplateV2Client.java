package com.sishuok.jiangzh.archi.designs.template.demo.v2;

import com.sishuok.jiangzh.archi.designs.template.demo.v1.LoginService;
import com.sishuok.jiangzh.archi.designs.template.demo.v1.LoginServiceIpml;

public class TemplateV2Client {

    public static void main(String[] args) {
//        LoginAbstrctTemplate template = new LoginOracleTemplate();
        LoginAbstrctTemplate template = new LoginMySQLTemplate();
        System.out.println("登录是否成功 ： "+template.login("Allen", "111"));

    }

}
