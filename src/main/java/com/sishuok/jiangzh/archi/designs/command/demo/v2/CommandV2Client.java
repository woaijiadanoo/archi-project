package com.sishuok.jiangzh.archi.designs.command.demo.v2;

import com.sishuok.jiangzh.archi.designs.command.demo.common.*;

import java.util.Arrays;
import java.util.List;

public class CommandV2Client {

    public static void main(String[] args) {
        OrderSystemInvokerV2 invoker = init();

        invoker.order(getOrders());
    }

    private static List<String> getOrders(){
        List<String> infos =
                Arrays.asList("凉菜-麻辣鸡丝","热菜-地三鲜","热菜-北京烤鸭");

        return infos;
    }

    private static OrderSystemInvokerV2 init(){
        CookieReceiver hot = new HotReceiver();
        CookieReceiver cool = new CoolReceiver();

        WaiterCommand command = new WaiterCommandA(cool,hot);

        OrderSystemInvokerV2 invoker = new OrderSystemInvokerV2();
        invoker.setCommand(command);

        return invoker;
    }

}
