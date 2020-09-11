package com.sishuok.jiangzh.archi.shopping.warehouse;

import java.util.ArrayList;
import java.util.List;

public class ObjectStruct {

    private List<WarehouseComponet> componets = new ArrayList<>();

    public void addComponet(WarehouseComponet warehouseComponet){
        this.componets.add(warehouseComponet);
    }

    public void soldNum(WarehouseVisitor warehouseVisitor){
        for(WarehouseComponet componet : componets){
            componet.accept(warehouseVisitor);
        }
    }


}
