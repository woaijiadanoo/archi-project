package com.sishuok.jiangzh.archi.designs.command.demo.common;

public class HotReceiver implements CookieReceiver{
    @Override
    public void make(String info) {
        System.out.println("热菜师傅正在制作 ： "+info);
    }
}
