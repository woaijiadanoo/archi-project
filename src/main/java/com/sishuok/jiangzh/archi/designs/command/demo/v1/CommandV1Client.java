package com.sishuok.jiangzh.archi.designs.command.demo.v1;

import java.util.Arrays;
import java.util.List;

public class CommandV1Client {

    public static void main(String[] args) {
        WaiterServiceAPI waiterService = new WaiterServiceImpl();

        waiterService.order(init());

    }

    private static List<String> init(){
        List<String> infos =
                Arrays.asList("凉菜-麻辣鸡丝","热菜-地三鲜","热菜-北京烤鸭");

        return infos;
    }

}
