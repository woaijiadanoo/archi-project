package com.sishuok.jiangzh.archi.designs.command.demo.v3;

import lombok.ToString;

import java.util.List;

@ToString
public class CommandModel {

    private int commandType; // order , pay
    private List<String> infos; // 被点选的菜单
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCommandType() {
        return commandType;
    }

    public void setCommandType(int commandType) {
        this.commandType = commandType;
    }

    public List<String> getInfos() {
        return infos;
    }

    public void setInfos(List<String> infos) {
        this.infos = infos;
    }
}
