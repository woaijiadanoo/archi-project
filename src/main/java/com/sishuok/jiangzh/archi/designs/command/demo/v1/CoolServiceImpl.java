package com.sishuok.jiangzh.archi.designs.command.demo.v1;

public class CoolServiceImpl implements CookieServiceAPI{
    @Override
    public void make(String info) {
        System.out.println("凉菜师傅正在制作 ： "+info);
    }
}
