package com.sishuok.jiangzh.archi.designs.command.demo.common;

public class CoolReceiver implements CookieReceiver{
    @Override
    public void make(String info) {

        System.out.println("凉菜师傅正在制作 ： "+info);
    }
}
