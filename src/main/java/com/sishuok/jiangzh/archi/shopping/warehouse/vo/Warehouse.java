package com.sishuok.jiangzh.archi.shopping.warehouse.vo;

import com.sishuok.jiangzh.archi.shopping.warehouse.WarehouseComponet;

import java.util.ArrayList;
import java.util.List;

public class Warehouse extends WarehouseComponet {

    private List<WarehouseComponet> componets = new ArrayList<>();

    public Warehouse(String name) {
        super(name);
    }

    @Override
    public void printStruct(String preName) {
        System.out.println(preName + " - "+ getName());
        preName += " ";
        for (WarehouseComponet componet : componets){
            componet.printStruct(preName);
        }
    }

    @Override
    public void addComponet(WarehouseComponet componet) {
        this.componets.add(componet);
    }

    @Override
    public void removeComponet(WarehouseComponet componet) {
        this.componets.remove(componet);
    }
}
