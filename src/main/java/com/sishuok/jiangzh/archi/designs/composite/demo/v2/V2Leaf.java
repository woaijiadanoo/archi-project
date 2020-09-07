package com.sishuok.jiangzh.archi.designs.composite.demo.v2;

public class V2Leaf extends V2Component{

    public V2Leaf(String name){
        super(name);
    }

    @Override
    public void printStruct(String preName) {
        System.out.println(preName+" - "+name);
    }
}
