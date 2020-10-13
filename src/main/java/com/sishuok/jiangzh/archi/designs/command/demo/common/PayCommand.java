package com.sishuok.jiangzh.archi.designs.command.demo.common;

import com.sishuok.jiangzh.archi.designs.command.demo.v3.CommandModel;

public class PayCommand implements Command{
    @Override
    public void execute(CommandModel commandModel) {
        System.out.println("支付请求 ：commandModel = " + commandModel);
    }
}
