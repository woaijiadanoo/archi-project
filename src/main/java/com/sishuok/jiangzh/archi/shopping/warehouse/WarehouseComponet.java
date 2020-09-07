package com.sishuok.jiangzh.archi.shopping.warehouse;

public abstract class WarehouseComponet {

    private String name;
    public WarehouseComponet(String name){
        this.name = name;
    }

    public abstract void printStruct(String preName);

    public void addComponet(WarehouseComponet componet){
        throw new UnsupportedOperationException("对象不支持此方法");
    }

    public void removeComponet(WarehouseComponet componet){
        throw new UnsupportedOperationException("对象不支持此方法");
    }


    public String getName() {
        return name;
    }
}
