package com.sishuok.jiangzh.archi.shopping.warehouse.vo;

import com.sishuok.jiangzh.archi.shopping.warehouse.WarehouseComponet;
import com.sishuok.jiangzh.archi.shopping.warehouse.WarehouseVisitor;

import java.util.List;
import java.util.Map;

// 格位
public class Grid extends WarehouseComponet {

    private int gridNum;

    public Grid(String name,int gridNum) {
        super(name);
        this.gridNum = gridNum;
    }

    @Override
    public void accept(WarehouseVisitor visitor) {
        visitor.visitGrid(this);
    }

    @Override
    public void printStruct(String preName) {
        System.out.println(preName + " - "+ getName() + " ["+this.gridNum+"] ");
    }

    @Override
    public void getChildren(Map<String, WarehouseComponet> map) {
        map.put(this.getName(), this);
    }

    public int getGridNum() {
        return gridNum;
    }

    public void setGridNum(int gridNum) {
        this.gridNum = gridNum;
    }
}
