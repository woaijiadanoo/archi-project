package com.sishuok.jiangzh.archi.shopping.warehouse;

import com.sishuok.jiangzh.archi.shopping.warehouse.vo.Grid;
import com.sishuok.jiangzh.archi.shopping.warehouse.vo.Warehouse;

public interface WarehouseVisitor {

   void visitWarehouse(Warehouse warehouse);

   void visitGrid(Grid grid);

}
