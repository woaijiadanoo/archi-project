package com.sishuok.jiangzh.archi.shopping.warehouse;

import com.sishuok.jiangzh.archi.shopping.warehouse.visitors.SoldVisitor;
import com.sishuok.jiangzh.archi.shopping.warehouse.vo.Grid;
import com.sishuok.jiangzh.archi.shopping.warehouse.vo.Warehouse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WarehouseClient {
    public static void main(String[] args) {
        WarehouseComponet root = init();

        // 打印整个仓库情况
        root.printStruct("");

        ObjectStruct objectStruct = new ObjectStruct();
        Map<String, WarehouseComponet> treeMap = new HashMap<>();
        root.getChildren(treeMap);
        for(String key : treeMap.keySet()){
            objectStruct.addComponet(treeMap.get(key));
        }

        WarehouseVisitor visitor = new SoldVisitor(5);

        objectStruct.soldNum(visitor);

        // 打印整个仓库情况
        root.printStruct("");
    }

    private static WarehouseComponet init(){
        WarehouseComponet root = new Warehouse("中央仓储管理");

        WarehouseComponet w1 = new Warehouse("生鲜仓库");
        WarehouseComponet w2 = new Warehouse("服装仓库");
        WarehouseComponet w3 = new Warehouse("鞋袜仓库");
        WarehouseComponet w4 = new Warehouse("饮品仓库");


        WarehouseComponet g1 = new Grid("帝王蟹",12);

        WarehouseComponet g2 = new Grid("衬衫", 20);
        WarehouseComponet g3 = new Grid("连衣裙", 50);

        WarehouseComponet g4 = new Grid("阿迪", 16);
        WarehouseComponet g5 = new Grid("拖鞋", 87);

        WarehouseComponet g6 = new Grid("百事可乐",23);

        w1.addComponet(g1);

        w2.addComponet(g2);
        w2.addComponet(g3);

        w3.addComponet(g4);
        w3.addComponet(g5);

        w4.addComponet(g6);

        root.addComponet(w1);
        root.addComponet(w2);
        root.addComponet(w3);
        root.addComponet(w4);

        return root;
    }


}
