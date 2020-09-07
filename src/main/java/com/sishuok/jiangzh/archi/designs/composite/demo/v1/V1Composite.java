package com.sishuok.jiangzh.archi.designs.composite.demo.v1;

import java.util.ArrayList;
import java.util.List;

/*
    树枝节点
 */
public class V1Composite {

    private String name;

    // 子树枝节点
    private List<V1Composite> childComposite = new ArrayList<>();
    private List<V1Leaf> childLeaf = new ArrayList<>();
    // 子树叶节点

    public V1Composite(String name){
        this.name = name;
    }

    // 维护子树枝节点
    public void addChildComposite(V1Composite composite){
        this.childComposite.add(composite);
    }

    // 维护树叶节点
    public void addChildLeaf(V1Leaf demoLeaf){
        this.childLeaf.add(demoLeaf);
    }

    public V1Composite getChildren(int index){

        return null;
    }

    public void printStruct(String preName){
        // 首先打印自己
        System.out.println(preName + " - "+ name);
        // 打印当前节点下的所有树叶节点
        for(V1Leaf demoLeaf : childLeaf){
            preName += " ";
            demoLeaf.printStruct(preName);
        }
        // 循环递归所有的子节点
        for(V1Composite composite : childComposite){
            preName += " ";
            composite.printStruct(preName);
        }

    }

}
