package com.sishuok.jiangzh.archi.designs.visitor.impl;

import java.util.ArrayList;
import java.util.List;

// 获取到了所有待操作的Element对象
public class ObjectStruct {

    private List<Element> elements = new ArrayList<>();

    public void operation(Visitor visitor){
        for(Element element : elements){
            element.accept(visitor);
        }
    }

    public void addElement(Element element){
        elements.add(element);
    }

}
