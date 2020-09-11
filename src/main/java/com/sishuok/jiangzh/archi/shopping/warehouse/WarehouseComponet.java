package com.sishuok.jiangzh.archi.shopping.warehouse;

import java.util.List;
import java.util.Map;

public abstract class WarehouseComponet {

    private String name;
    public WarehouseComponet(String name){
        this.name = name;
    }

    // 访问者模式的回调方法
    public abstract void accept(WarehouseVisitor visitor);

    public abstract void printStruct(String preName);

    public abstract void getChildren(Map<String,WarehouseComponet> map);

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
