package com.sishuok.jiangzh.archi.shopping.warehouse.vo;

import com.sishuok.jiangzh.archi.shopping.warehouse.WarehouseComponet;

// 格位
public class Grid extends WarehouseComponet {

    private int gridNum;

    public Grid(String name,int gridNum) {
        super(name);
        this.gridNum = gridNum;
    }

    @Override
    public void printStruct(String preName) {
        System.out.println(preName + " - "+ getName() + " ["+this.gridNum+"] ");
    }

    public int getGridNum() {
        return gridNum;
    }

    public void setGridNum(int gridNum) {
        this.gridNum = gridNum;
    }
}
