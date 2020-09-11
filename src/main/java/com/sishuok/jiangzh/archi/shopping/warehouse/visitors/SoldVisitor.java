package com.sishuok.jiangzh.archi.shopping.warehouse.visitors;

import com.sishuok.jiangzh.archi.shopping.warehouse.WarehouseVisitor;
import com.sishuok.jiangzh.archi.shopping.warehouse.vo.Grid;
import com.sishuok.jiangzh.archi.shopping.warehouse.vo.Warehouse;

public class SoldVisitor implements WarehouseVisitor {

    private int soldNum;

    public SoldVisitor(int soldNum){
        this.soldNum = soldNum;
    }

    @Override
    public void visitWarehouse(Warehouse warehouse) {

    }

    @Override
    public void visitGrid(Grid grid) {
        // 业务验证，格位中是否有足够的格子

        // 扣除相应的商品数量，完成出货
        int gridNum = grid.getGridNum();
        gridNum = gridNum - soldNum;

        // 将结果反馈给具体的格位信息
        grid.setGridNum(gridNum);
    }
}
