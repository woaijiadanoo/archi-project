package com.sishuok.jiangzh.archi.designs.template.demo.v1;

public class TemplateV1Client {

    public static void main(String[] args) {
        LoginService loginService = new LoginServiceIpml();
        System.out.println("登录是否成功 ： "+loginService.login("Allen", "111"));

    }

}
