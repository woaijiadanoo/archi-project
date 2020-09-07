package com.sishuok.jiangzh.archi.designs.composite.demo.v2;

import java.util.ArrayList;
import java.util.List;

public class V2Composite extends V2Component{

    public V2Composite(String name) {
        super(name);
    }

    @Override
    public void printStruct(String preName) {
        System.out.println(preName+" - "+name);
        preName += " ";
        for(V2Component component : children){
            component.printStruct(preName);
        }
    }

    // 维护子节点关系
    private List<V2Component> children = new ArrayList<>();

    @Override
    public void addChild(V2Component component) {
        this.children.add(component);
    }
}
