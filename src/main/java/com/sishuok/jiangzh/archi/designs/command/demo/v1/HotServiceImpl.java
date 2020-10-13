package com.sishuok.jiangzh.archi.designs.command.demo.v1;

public class HotServiceImpl implements CookieServiceAPI{
    @Override
    public void make(String info) {
        System.out.println("热菜师傅正在制作 ： "+info);
    }
}
