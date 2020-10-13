package com.sishuok.jiangzh.archi.designs.command.demo.v3;

import com.sishuok.jiangzh.archi.designs.command.demo.common.*;
import com.sishuok.jiangzh.archi.designs.command.demo.v2.OrderSystemInvokerV2;
import com.sishuok.jiangzh.archi.designs.command.demo.v2.WaiterCommand;
import com.sishuok.jiangzh.archi.designs.command.demo.v2.WaiterCommandA;

import java.util.Arrays;
import java.util.List;

public class CommandV3Client {

    public static void main(String[] args) {
        OrderSystemInvokerV3 invokerV3 = init();

        CommandModel commandModel = new CommandModel();
        commandModel.setCommandType(1);
        commandModel.setInfos(getOrders());

//        invokerV3.order(commandModel);
        invokerV3.pay(commandModel);
    }

    private static List<String> getOrders(){
        List<String> infos =
                Arrays.asList("凉菜-麻辣鸡丝","热菜-地三鲜","热菜-北京烤鸭");

        return infos;
    }

    private static OrderSystemInvokerV3 init(){
        CookieReceiver hot = new HotReceiver();
        CookieReceiver cool = new CoolReceiver();

        WaiterCommand command = new WaiterCommandA(cool,hot);
        Command c = new PayCommand();

        OrderSystemInvokerV3 invoker = new OrderSystemInvokerV3();
        invoker.setCommand(command);
        invoker.setPayCommand(c);

        return invoker;
    }

}
