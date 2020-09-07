package com.sishuok.jiangzh.archi.designs.composite.demo.v1;

/*
    树叶节点
 */
public class V1Leaf {

    private String name;

    public V1Leaf(String name){
        this.name = name;
    }

    public void printStruct(String preName){
        // preName是空格实现
        System.out.println(preName + " - "+ name);
    }

}
